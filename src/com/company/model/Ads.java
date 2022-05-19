package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Ads {

    private int id;
    private String title;
    private String subtitle;
    private String description;
    private double price;
    private int UserId;

}
