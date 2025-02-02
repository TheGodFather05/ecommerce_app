package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.Category;
import com.ecommerce.api.entity.translate.Language;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class CategoryTranslate  extends BaseEntity {

  @Column
  private String title;
  @ManyToOne
  @JoinColumn(name = "id_Category")
  private Category category;
  @ManyToOne
  @JoinColumn(name = "id_Language")
  private Language language;

}
