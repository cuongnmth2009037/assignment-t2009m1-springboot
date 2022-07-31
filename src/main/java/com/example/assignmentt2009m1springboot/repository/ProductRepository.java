package com.example.assignmentt2009m1springboot.repository;

import com.example.assignmentt2009m1springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
