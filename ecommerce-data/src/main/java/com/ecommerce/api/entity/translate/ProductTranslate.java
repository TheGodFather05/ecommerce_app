package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.translate.Language;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class ProductTranslate extends BaseEntity {

  @Column
  private String name;
  @Column
  private String description;
  @ManyToOne
  @JoinColumn(name = "id_Product")
  private Product product;
  @ManyToOne
  @JoinColumn(name = "id_Language")
  private Language language;


}
