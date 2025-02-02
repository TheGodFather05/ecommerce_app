package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.SubcategoryProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class CategoryPropertiesTranslate  extends BaseEntity {

  @Column
  private String title;
  @Column
  private long idLanguage;
  @ManyToOne
  @JoinColumn(name = "id_Subcategory_Property")
  private SubcategoryProperties subcategoryProperties;


}
