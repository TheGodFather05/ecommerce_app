package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table
public class ProductHistory extends BaseEntity {

  @Column
  private long idProduct;
  @Column
  private long quantity;
  @Column
  private String state;
  @ManyToOne
  @JoinColumn(name = "id_Product")
  private Product product;


  public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }


  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
