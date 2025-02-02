package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class ProductCategoryProperty  extends BaseEntity {

  @Column
  private String value;
  @Column
  private long idValue;
  @ManyToOne
  @JoinColumn(name = "id_Product")
  private Product product;
  @ManyToOne
  @JoinColumn(name = "id_Property")
  private CategoryProperties categoryProperties;


}
