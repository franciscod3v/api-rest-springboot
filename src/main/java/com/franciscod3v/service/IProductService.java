package com.franciscod3v.service;

import com.franciscod3v.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    void save(Product product);
    void deleteById(Long id);
}