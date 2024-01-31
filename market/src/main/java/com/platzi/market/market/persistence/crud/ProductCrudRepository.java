package com.platzi.market.market.persistence.crud;

import com.platzi.market.market.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

}
