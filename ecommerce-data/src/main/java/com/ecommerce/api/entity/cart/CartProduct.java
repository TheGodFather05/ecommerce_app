package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "CartProduct")
public class CartProduct  extends BaseEntity {

  @Column
  private long cartId;
  @Column
  private long quantiti;
  @Column
  private double unitPrice;
  @Column
  private double price;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;


}
