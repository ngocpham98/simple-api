package com.ecommerce.controller;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public List<ProductDto> listProduct(){
        return productService.listProduct();
    }
    @PostMapping("/add")
    public String addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
        return "add product successfully";
    }
    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") long id,@RequestBody ProductDto productDto){
        productService.updateProduct(id, productDto);
        return "update product successfully";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id){
        productService.deleteProduct(id);
        return "delete product successfully";
    }
}
