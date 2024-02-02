package com.platzi.market.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer purchaseId;
    @Column(name = "id_cliente")
    private String ClientId;
    @Column(name = "fecha")
    private LocalDateTime date;
    @Column(name = "medio_pago")
    private String paymentMethod;
    @Column(name = "comentario")
    private String comment;
    @Column(name = "estado")
    private String status;
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private ClientEntity client;
    @OneToMany
    @JoinColumn(name = "purchase")
    private List<PurchaseProductsEntity> products;
    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

