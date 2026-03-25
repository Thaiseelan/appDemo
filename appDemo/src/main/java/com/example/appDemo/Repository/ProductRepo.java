package com.example.appDemo.Repository;

import com.example.appDemo.models.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<products, Integer> {

}
