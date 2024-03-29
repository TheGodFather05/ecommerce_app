package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "CartProduct")
public class CartProduct  extends BaseEntity {

  @Column
  private long cartId;
  @Column
  private long productId;
  @Column
  private long quantiti;
  @Column
  private double unitPrice;
  @Column
  private double price;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;


  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getQuantiti() {
    return quantiti;
  }

  public void setQuantiti(long quantiti) {
    this.quantiti = quantiti;
  }


  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
