package com.ecommerce.api.entity.misc;


import com.ecommerce.api.entity.BaseEntity;

public class PaymentMethod  extends BaseEntity {

  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
