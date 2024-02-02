package com.platzi.market.market.persistence;

import com.platzi.market.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.market.persistence.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;
    public List<ProductEntity> getAll() {
        return (List<ProductEntity>) productCrudRepository.findAll();
    }

    public List<ProductEntity> getByCategory (int categoryId){
        return  productCrudRepository.findByCategoryIdOrderByNameASC(categoryId);
    }

    public Optional<List<ProductEntity>> getLimited(int amount){
        return productCrudRepository.findByStockLessThanAndStatus(amount, true);
    }

    public Optional<ProductEntity> getProduct(int productId){
        return productCrudRepository.findById(productId);
    }

    public ProductEntity save(ProductEntity product) {
        return productCrudRepository.save(product);
    }

    public void delete(int productId) {
        productCrudRepository.deleteById(productId);
    }
}
