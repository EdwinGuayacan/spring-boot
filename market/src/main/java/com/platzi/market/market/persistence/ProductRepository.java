package com.platzi.market.market.persistence;

import com.platzi.market.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.market.persistence.entity.Product;

import java.util.List;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;
    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }
}
