package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class ProductHistory extends BaseEntity {

  @Column
  private long quantity;
  @Column
  private String state;
  @ManyToOne
  @JoinColumn(name = "id_Product")
  private Product product;


}
