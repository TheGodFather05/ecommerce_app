package com.ecommerce.api.entity.misc;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Currency  extends BaseEntity {

  @Column
  private String name;
  @Column
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
