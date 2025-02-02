package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Town;
import lombok.Getter;
import lombok.Setter;
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
@Getter
@Setter
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
    private Set<UserSettings> userSettings = new HashSet<>();


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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(role);
    }

}
