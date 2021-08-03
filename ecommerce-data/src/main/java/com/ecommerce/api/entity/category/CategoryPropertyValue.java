package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table
public class CategoryPropertyValue  extends BaseEntity {

 /* @Column
  private long idProperty;*/
  @Column
  private String value;
  @ManyToOne(targetEntity = CategoryProperties.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  @JoinColumn(name = "id_Property")
  private CategoryProperties categoryProperties;


  /*public long getIdProperty() {
    return idProperty;
  }

  public void setIdProperty(long idProperty) {
    this.idProperty = idProperty;
  }*/


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
