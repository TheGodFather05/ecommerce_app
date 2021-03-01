package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

public class CategoryPropertyValue  extends BaseEntity {

  private long idProperty;
  private String value;
  private CategoryProperties categoryProperties;


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


  public CategoryProperties getCategoryProperties() {
    return categoryProperties;
  }

  public void setCategoryProperties(CategoryProperties categoryProperties) {
    this.categoryProperties = categoryProperties;
  }
}
