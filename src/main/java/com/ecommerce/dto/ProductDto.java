package com.ecommerce.dto;

import com.ecommerce.entity.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class ProductDto {
    private Long id;
    private String productName;
    private String productDetail;
    private double price;
    private String imageURL;

    private Long categoryId;

    public ProductDto(){}

    public ProductDto(Long id, String productName, String productDetail, double price, String imageURL, Long categoryId) {
        this.id = id;
        this.productName = productName;
        this.productDetail = productDetail;
        this.price = price;
        this.imageURL = imageURL;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}