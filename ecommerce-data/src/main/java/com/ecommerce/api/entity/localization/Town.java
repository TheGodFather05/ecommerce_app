package com.ecommerce.api.entity.localization;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Country;

import javax.persistence.*;

@Entity
@Table
public class Town extends BaseEntity {

  @Column
  private String name;
  @Column
  private long idCountry;
  @ManyToOne
  @JoinColumn(name = "id_Country")
  private Country country;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getIdCountry() {
    return idCountry;
  }

  public void setIdCountry(long idCountry) {
    this.idCountry = idCountry;
  }


  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
