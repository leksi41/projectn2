package com.company.dao;


import com.company.model.Ads;

import java.util.List;

public interface AdsDao {

    void insert(Ads user);

    boolean update(Ads user);

    void delete(int id);

    List<Ads> getAllAds();

    Ads read(int id);
}
