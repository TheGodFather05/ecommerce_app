package com.ecommerce.api.entity.localization;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Country;

public class Town extends BaseEntity {

  private String name;
  private long idCountry;
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
