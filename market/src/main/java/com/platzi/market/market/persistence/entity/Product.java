package com.platzi.market.market.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer productId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "id_categoria")
    private Integer CategoryId;
    @Column(name = "codigo_barras")
    private String barCode;
    @Column(name = "precio_venta")
    private Double salePrice;
    @Column(name = "cantidad_stock")
    private Integer Stock;
    @Column(name = "estado")
    private Boolean state;
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Category category;
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }


}
