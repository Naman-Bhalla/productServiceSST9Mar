package com.scaler.productservicesst9mar.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String image;
    private double price;
}
