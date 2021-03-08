package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Town;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class User extends BaseEntity {

  @Column
  private long id;
  @Column
  private String firstName;
  @Column
  private String lastName;
  @Column
  private String email;
  @Column
  private long telephone;
  @Column
  private long coountryCode;
  @Column
  private String username;
  @Column
  private String password;
  @Column
  private long idTown;
  @Column
  private long idRole;
  @ManyToOne
  @JoinColumn(name = "id_Role")
  private Role role;
  @ManyToOne
  @JoinColumn(name = "id_Town")
  private Town town;
  @OneToMany(mappedBy = "id_User")
  private Set<UserSettings> userSettings=new HashSet<>();


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getTelephone() {
    return telephone;
  }

  public void setTelephone(long telephone) {
    this.telephone = telephone;
  }


  public long getCoountryCode() {
    return coountryCode;
  }

  public void setCoountryCode(long coountryCode) {
    this.coountryCode = coountryCode;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getIdTown() {
    return idTown;
  }

  public void setIdTown(long idTown) {
    this.idTown = idTown;
  }


  public long getIdRole() {
    return idRole;
  }

  public void setIdRole(long idRole) {
    this.idRole = idRole;
  }

}
