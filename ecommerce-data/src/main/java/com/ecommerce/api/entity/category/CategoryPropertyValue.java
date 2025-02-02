package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class CategoryPropertyValue  extends BaseEntity {

  @Column
  private String value;
  @ManyToOne
  @JoinColumn(name = "id_Property")
  private CategoryProperties categoryProperties;


}
