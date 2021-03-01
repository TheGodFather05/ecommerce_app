package com.ecommerce.api.data.user;


import com.ecommerce.api.entity.user.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSettingsRepository extends JpaRepository<UserSettings,Long> {

}
