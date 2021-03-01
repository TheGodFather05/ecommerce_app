package com.ecommerce.api.entity.localization;


import com.ecommerce.api.entity.BaseEntity;

import java.util.HashSet;
import java.util.Set;

public class Country extends BaseEntity {

  private String name;
  private Set<Town> towns=new HashSet<>();


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
