package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.misc.PaymentMethod;
import com.ecommerce.api.entity.misc.Shiper;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class Sales extends BaseEntity {

  @Column
  private double price;
  @Column
  private java.sql.Timestamp dateCompleted;
  @Column
  private long idTownShip;
  @Column
  private double shipmentPrice;
  @ManyToOne
  @JoinColumn(name = "id_payment_method")
  private PaymentMethod paymentMethod;
  @ManyToOne
  @JoinColumn(name = "id_shiper")
  private Shiper shiper;
  @OneToOne
  @JoinColumn(name = "id_cart")
  private Cart cart;


}
