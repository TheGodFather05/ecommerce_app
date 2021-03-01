package com.ecommerce.api.data.localization;


import com.ecommerce.api.entity.localization.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

}
