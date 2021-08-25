package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Role extends BaseEntity implements GrantedAuthority {

  @Column(unique = true)
  private String name;
  @ManyToMany(mappedBy = "roles")
  private Set<User> users=new HashSet<>();


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }

  @Override
    public String getAuthority() {
        return name;
    }
}
