package com.ecommerce.api.entity.misc;


import com.ecommerce.api.entity.BaseEntity;

public class Currency  extends BaseEntity {

  private String name;
  private double rateOnDollar;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getRateOnDollar() {
    return rateOnDollar;
  }

  public void setRateOnDollar(double rateOnDollar) {
    this.rateOnDollar = rateOnDollar;
  }

}
