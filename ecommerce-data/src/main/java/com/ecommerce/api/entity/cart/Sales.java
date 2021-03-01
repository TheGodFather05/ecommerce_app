package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.misc.PaymentMethod;
import com.ecommerce.api.entity.misc.Shiper;

public class Sales extends BaseEntity {

  private long idCart;
  private double price;
  private java.sql.Timestamp dateCompleted;
  private long idTownShip;
  private double shipmentPrice;
  private long idPaymentMethod;
  private long idShiper;
  private PaymentMethod paymentMethod;
  private Shiper shiper;


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
}
