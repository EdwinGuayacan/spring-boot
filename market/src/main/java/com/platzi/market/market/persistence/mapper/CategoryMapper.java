package com.platzi.market.market.persistence.mapper;

import com.platzi.market.market.domain.Category;
import com.platzi.market.market.persistence.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "categoryId", target = "categoryId"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "status", target = "active")
    })
    Category toCategory(CategoryEntity category);
    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    CategoryEntity toCategoryEntity(Category category);
}
