package com.ecommerce.api.entity.localization;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Country extends BaseEntity {

  @Column
  private String name;
  @OneToMany(mappedBy = "id_country")
  private Set<Town> towns=new HashSet<>();


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
