package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.misc.PaymentMethod;
import com.ecommerce.api.entity.misc.Shiper;

import javax.persistence.*;

@Entity
@Table
public class Sales extends BaseEntity {

  @Column
  private long idCart;
  @Column
  private double price;
  @Column
  private java.sql.Timestamp dateCompleted;
  @Column
  private long idTownShip;
  @Column
  private double shipmentPrice;
  @Column
  private long idPaymentMethod;
  @Column
  private long idShiper;
  @ManyToOne
  @JoinColumn(name = "id_payment_method")
  private PaymentMethod paymentMethod;
  @ManyToOne
  @JoinColumn(name = "id_shiper")
  private Shiper shiper;
  @OneToOne
  @JoinColumn(name = "id_cart")
  private Cart cart;


  public long getIdCart() {
    return idCart;
  }

  public void setIdCart(long idCart) {
    this.idCart = idCart;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public java.sql.Timestamp getDateCompleted() {
    return dateCompleted;
  }

  public void setDateCompleted(java.sql.Timestamp dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  public long getIdTownShip() {
    return idTownShip;
  }

  public void setIdTownShip(long idTownShip) {
    this.idTownShip = idTownShip;
  }


  public double getShipmentPrice() {
    return shipmentPrice;
  }

  public void setShipmentPrice(double shipmentPrice) {
    this.shipmentPrice = shipmentPrice;
  }


  public long getIdPaymentMethod() {
    return idPaymentMethod;
  }

  public void setIdPaymentMethod(long idPaymentMethod) {
    this.idPaymentMethod = idPaymentMethod;
  }


  public long getIdShiper() {
    return idShiper;
  }

  public void setIdShiper(long idShiper) {
    this.idShiper = idShiper;
  }


  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Shiper getShiper() {
    return shiper;
  }

  public void setShiper(Shiper shiper) {
    this.shiper = shiper;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
}
