package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Town;
import com.ecommerce.api.entity.misc.PaymentMethod;
import com.ecommerce.api.entity.misc.Shiper;

import javax.persistence.*;

@Entity
@Table
public class Sales extends BaseEntity {

  /*@Column(name = "cart_id")
  private long cartId;*/
  @Column
  private double price;
  @Column
  private java.sql.Timestamp dateCompleted;
 /* @Column
  private long townShipId;*/
  @Column
  private double shipmentPrice;
  /*@Column
  private long idPaymentMethod;*/
  /*@Column
  private long idShiper;*/
  @ManyToOne(targetEntity = Town.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  @JoinColumn(name = "town_ship_id")
  private Town town;
  @ManyToOne(targetEntity = PaymentMethod.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  @JoinColumn(name = "id_payment_method")
  private PaymentMethod paymentMethod;
  @ManyToOne(targetEntity = Shiper.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  @JoinColumn(name = "id_shiper")
  private Shiper shiper;
  @OneToOne
  @JoinColumn(name = "cart_id")
  private Cart cart;


  /*public long getCartId() {
    return cartId;
  }

  public void setCartId(long idCart) {
    this.cartId = idCart;
  }*/


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


  /*public long getTownShipId() {
    return townShipId;
  }

  public void setTownShipId(long idTownShip) {
    this.townShipId = idTownShip;
  }*/

  public Town getTown() {
    return town;
  }

  public void setTown(Town town) {
    this.town = town;
  }

  public double getShipmentPrice() {
    return shipmentPrice;
  }

  public void setShipmentPrice(double shipmentPrice) {
    this.shipmentPrice = shipmentPrice;
  }


  /*public long getIdPaymentMethod() {
    return idPaymentMethod;
  }

  public void setIdPaymentMethod(long idPaymentMethod) {
    this.idPaymentMethod = idPaymentMethod;
  }*/


  /*public long getIdShiper() {
    return idShiper;
  }

  public void setIdShiper(long idShiper) {
    this.idShiper = idShiper;
  }*/


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
