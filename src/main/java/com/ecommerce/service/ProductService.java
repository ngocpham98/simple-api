package com.ecommerce.service;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entity.Category;
import com.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    public ProductDto toDto(Product product);
    public List<ProductDto> listProduct();
    public void addProduct(ProductDto productDto);
    public void updateProduct(long id,ProductDto productDto);
    public void deleteProduct(long id);
}
