package com.example.billing.order;

import com.example.billing.services.Service;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Long orderId;
    private Boolean selected;
    @ManyToMany
    private Set<Service> service;
    private Integer quantity;
    private Boolean pay;
    private Boolean payableByInsurance;
    private Integer unitPrice;

    public Order() {

    }
    public Order(Long orderId, Boolean selected, Integer quantity, Boolean pay, Boolean payableByInsurance, Integer unitPrice) {
        this.orderId = orderId;
        this.selected = selected;
        this.quantity = quantity;
        this.pay = pay;
        this.payableByInsurance = payableByInsurance;
        this.unitPrice = unitPrice;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Set<Service> getService() {
        return service;
    }

    public void setService(Set<Service> service) {
        this.service = service;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public Boolean getPayableByInsurance() {
        return payableByInsurance;
    }

    public void setPayableByInsurance(Boolean payableByInsurance) {
        this.payableByInsurance = payableByInsurance;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", selected=" + selected +
                ", service=" + service +
                ", quantity=" + quantity +
                ", pay=" + pay +
                ", payableByInsurance=" + payableByInsurance +
                ", unitPrice=" + unitPrice +
                '}';
    }


}
