package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

public class SubcategoryPropertyValue extends BaseEntity {

  private long idProperty;
  private String value;
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
