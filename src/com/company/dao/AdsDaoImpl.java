package com.company.dao;

import com.company.model.Ads;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdsDaoImpl implements AdsDao {
    private static final String SELECT_ALL_Ads = "SELECT * FROM Ads";

    @Override
    public void insert(Ads ads) {
        try (Connection connection = DBConnection.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Ads(title,subtitle,description,price,user_id) VALUES (?,?,?,?,?)")) {
            preparedStatement.setString(1, ads.getTitle());
            preparedStatement.setString(2, ads.getSubtitle());
            preparedStatement.setString(3, ads.getDescription());
            preparedStatement.setDouble(4, ads.getPrice());
            preparedStatement.setInt(5, 1);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(Ads ads) {
        return false;
    }

    @Override
    public void delete(int id) {


        try (Connection connection = DBConnection.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM Ads(title,subtitle,description,price,user_id) WHERE (user_id=?)")){
            preparedStatement.setInt(5, 1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ads> getAllAds() {
        List<Ads> list = new ArrayList<>();
        try (Connection connection = DBConnection.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Ads)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(Ads.builder()
                        .id(resultSet.getInt(1))
                        .title(resultSet.getString(2))
                        .subtitle(resultSet.getString(3))
                        .description(resultSet.getString(4))
                        .price(resultSet.getDouble(5))
                        .UserId(resultSet.getInt(6))
                        .build()
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Ads read(int id) {
        return null;
    }
}
