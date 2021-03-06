package com.example.billing.order;

import javax.persistence.*;

@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Long orderId;
    private Boolean selected;
    private String service;
    private Integer quantity;
    private Boolean pay;
    private Boolean payableByInsurance;
    private Integer unitPrice;
    private Integer itemTotal;
    private Integer totalAmount;

    public Integer getTotalAmount() {
        totalAmount = unitPrice;
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Integer insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Integer getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Integer cashAmount) {
        this.cashAmount = cashAmount;
    }

    private Integer insuranceAmount;
    private Integer cashAmount;

    public Integer getItemTotal() {
        itemTotal=this.quantity*this.unitPrice;
        return itemTotal;
    }


    public void setItemTotal(Integer itemTotal) {
        this.itemTotal = itemTotal;
    }



    public Order() {

    }
    public Order(Long orderId, Boolean selected, Integer quantity, Boolean pay, Boolean payableByInsurance, Integer unitPrice, String service) {
        this.orderId = orderId;
        this.selected = selected;
        this.quantity = quantity;
        this.pay = pay;
        this.payableByInsurance = payableByInsurance;
        this.unitPrice = unitPrice;
        this.service=service;
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
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
