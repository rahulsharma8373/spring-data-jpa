package com.rahul.jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
