package com.samsung.basicsecurity.services;

import com.samsung.basicsecurity.repositories.ProductsRepository;
import com.samsung.basicsecurity.repositories.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getProductByProductName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }
    public List<Product> getProductByCatalogId(Long catalogId) {
        return productRepository.findByCatalogId(catalogId);
    }

}
