package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Town;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
//import org.springframework.security.core.userdetails.


@Entity
@Table
public class User extends BaseEntity implements UserDetails {

  @Column
  private long id;
  @Column
  private String firstName;
  @Column
  @NotBlank(message = "Last name is required")
  private String lastName;
  @Column
  @NotBlank(message = "email is required")
  private String email;
  @Column
  private long telephone;
  @Column
  private long coountryCode;
  @Column
  @NotBlank(message = "Please provide user name ")
  private String username;
  @Column
  @NotBlank(message = "Provide valid password please")
  private String password;
  /*@Column
  private long idTown;
  @Column
  private long idRole;*/
  @ManyToOne(targetEntity = Role.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  @JoinColumn(name = "id_Role")
  private Role role;
  @ManyToOne(targetEntity = Town.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
  @JoinColumn(name = "id_Town")
  private Town town;
  @OneToMany(mappedBy = "user",targetEntity = UserSettings.class,cascade = CascadeType.ALL)
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

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Arrays.asList(role);
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }



  /*public long getIdTown() {
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
  }*/

}
