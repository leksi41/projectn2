package com.company.dao;


import com.company.model.Ads;

import java.util.List;

public interface AdsDao {

    void insert(Ads ads);

    boolean update(Ads ads);

    void delete(int id);

    List<Ads> getAllAds();

    Ads read(int id);
}
