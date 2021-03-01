package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Town;

import java.util.HashSet;
import java.util.Set;

public class User extends BaseEntity {

  private long id;
  private String firstName;
  private String lastName;
  private String email;
  private long telephone;
  private long coountryCode;
  private String username;
  private String password;
  private long idTown;
  private long idRole;
  private Role role;
  private Town town;
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
