package com.platzi.market.market.persistence.crud;

import com.platzi.market.market.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    List<ProductEntity> findByCategoryIdOrderByNameASC(int categoryId);
    Optional<List<ProductEntity>> findByStockLessThanAndStatus(int stock, boolean status);
}
