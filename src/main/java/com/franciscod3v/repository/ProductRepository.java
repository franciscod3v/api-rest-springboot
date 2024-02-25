package com.franciscod3v.repository;

import com.franciscod3v.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    //Con Query Methods
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    //Con notación Query
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findByProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
}
