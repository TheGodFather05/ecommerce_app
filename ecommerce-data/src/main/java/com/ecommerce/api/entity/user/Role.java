package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Role extends BaseEntity implements GrantedAuthority {

  @Column
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

    @Override
    public String getAuthority() {
        return name;
    }
}
