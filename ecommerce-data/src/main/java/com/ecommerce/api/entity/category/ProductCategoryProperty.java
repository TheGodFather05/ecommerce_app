package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;

public class ProductCategoryProperty  extends BaseEntity {

  private long idProduct;
  private long idProperty;
  private String value;
  private long idValue;
  private Product product;
  private CategoryProperties categoryProperties;

  public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }


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


  public long getIdValue() {
    return idValue;
  }

  public void setIdValue(long idValue) {
    this.idValue = idValue;
  }


  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public CategoryProperties getCategoryProperties() {
    return categoryProperties;
  }

  public void setCategoryProperties(CategoryProperties categoryProperties) {
    this.categoryProperties = categoryProperties;
  }
}
