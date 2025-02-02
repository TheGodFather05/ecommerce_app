package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.SubcategoryProperties;
import com.ecommerce.api.entity.translate.Language;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class SubCategoryPropertiesTranslate extends BaseEntity {

  @Column
  private String title;
  @ManyToOne
  @JoinColumn(name = "id_Subcategory_Properties")
  private SubcategoryProperties subcategoryProperties;
  @ManyToOne
  @JoinColumn(name = "id_Language")
  private Language language;


}
