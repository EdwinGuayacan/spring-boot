package com.platzi.market.market.domain.repository;

import com.platzi.market.market.persistence.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<ProductEntity> getAll();
    Optional<List<ProductEntity>> getByCategory(int categoryId);
    Optional<List<ProductEntity>> getLimitedProducts(int quantity);
    Optional<ProductEntity> getProduct (int productId);
    ProductEntity save (ProductEntity product);
    void delete(int productId);
}
