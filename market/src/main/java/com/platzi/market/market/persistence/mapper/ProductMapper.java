package com.platzi.market.market.persistence.mapper;

import com.platzi.market.market.domain.Product;
import com.platzi.market.market.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "productId", target = "productId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "categoryId", target = "categoryId"),
            @Mapping(source = "salePrice", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "status", target = "active"),
            @Mapping(source = "category", target = "category"),



    })
    Product toProduct(ProductEntity productEntity);
    List<Product> toProducts(List<ProductEntity> products);
    @Mapping(target = "barCode", ignore = true)
    ProductEntity toProductEntity(Product product);
}
