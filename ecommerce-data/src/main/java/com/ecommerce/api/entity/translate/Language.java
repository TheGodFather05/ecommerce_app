package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table
public class Language  extends BaseEntity {

  @Column
  private String code;
  @Column
  private String title;


}
