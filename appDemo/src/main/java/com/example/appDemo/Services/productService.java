package com.example.appDemo.Services;
import com.example.appDemo.Repository.ProductRepo;
import com.example.appDemo.models.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class productService {
    @Autowired
    ProductRepo productRepo;
    public List<products> getProducts(){
        return productRepo.findAll();
    }

    public products getProductById(int prodId){
        return productRepo.findById(prodId)
                .orElseThrow();
    }

    public void addProduct(products prod){
        productRepo.save(prod);
    }


    public void updateProduct(products prod) {
        productRepo.save(prod);
    }
    public void deleteProduct(int proId){
        productRepo.deleteById(proId);
    }
}
