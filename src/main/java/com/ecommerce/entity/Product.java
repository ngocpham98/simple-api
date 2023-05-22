package com.ecommerce.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private @NotNull String productName;
    @Column(name = "product_detail")
    private String productDetail;
    @Column(name = "price")
    private @NotNull double price;
    @Column(name = "image_url")
    private String imageURL;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(){}

    public Product(Long id, String productName, String productDetail, double price, String imageURL, Category category) {
        this.id = id;
        this.productName = productName;
        this.productDetail = productDetail;
        this.price = price;
        this.imageURL = imageURL;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

