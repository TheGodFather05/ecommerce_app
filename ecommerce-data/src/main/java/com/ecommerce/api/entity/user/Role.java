package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table
public class Role extends BaseEntity implements GrantedAuthority {

  @Column
  private String name;


    @Override
    public String getAuthority() {
        return name;
    }
}
