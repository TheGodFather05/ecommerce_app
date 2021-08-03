package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;

import javax.persistence.*;

@Entity
@Table
public class ProductCategoryProperty extends BaseEntity {

    /* @Column
     private long idProduct;
     @Column
     private long idProperty;*/
    @Column
    private String value;
    @Column
    private long idValue;
    @ManyToOne(targetEntity = Product.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Product")
    private Product product;
    @ManyToOne(targetEntity = CategoryProperties.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Property")
    private CategoryProperties categoryProperties;

  /*public long getIdProduct() {
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
  }*/


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
