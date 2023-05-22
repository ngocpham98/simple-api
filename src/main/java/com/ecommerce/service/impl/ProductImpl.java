package com.ecommerce.service.impl;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entity.Category;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ProductDto> listProduct() {
        List<Product>listProduct = productRepository.findAll();
        List<ProductDto> dtoProductList = new ArrayList<>();
        for(Product product:listProduct){
            dtoProductList.add(toDto(product));
        }
        return dtoProductList;
    }
    @Override
    public void addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setProductName(productDto.getProductName());
        product.setProductDetail(productDto.getProductDetail());
        product.setPrice(productDto.getPrice());
        product.setImageURL(productDto.getImageURL());
        product.setCategory(categoryRepository.findById(productDto.getCategoryId()).get());
        productRepository.save(product);
    }

    @Override
    public void updateProduct(long id, ProductDto productDto) {
        try {
            Product product = productRepository.findById(id).get();
            product.setProductName(productDto.getProductName());
            product.setProductDetail(productDto.getProductDetail());
            product.setPrice(productDto.getPrice());
            product.setImageURL(productDto.getImageURL());
            productRepository.save(product);
        }
        catch(Exception e){
            throw new RuntimeException("product is not exist");
        }
    }
    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setProductName(product.getProductName());
        productDto.setProductDetail(product.getProductDetail());
        productDto.setPrice(product.getPrice());
        productDto.setImageURL(product.getImageURL());
        productDto.setCategoryId(product.getCategory().getId());
        return productDto;
    }
}
