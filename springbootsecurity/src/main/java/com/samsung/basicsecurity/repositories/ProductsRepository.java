package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByCatalogId(Long catalogId);
    List<Product> findByNameContainingIgnoreCase(String name);
}
