package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table
public class SubcategoryPropertyValue extends BaseEntity {

  @Column
  private long idProperty;
  @Column
  private String value;
  @ManyToOne
  @JoinColumn(name = "id_Property")
  private  SubcategoryProperties subcategoryProperties;


  public long getIdProperty() {
    return idProperty;
  }

  public void setIdProperty(long idProperty) {
    this.idProperty = idProperty;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public SubcategoryProperties getSubcategoryProperties() {
    return subcategoryProperties;
  }

  public void setSubcategoryProperties(SubcategoryProperties subcategoryProperties) {
    this.subcategoryProperties = subcategoryProperties;
  }
}
