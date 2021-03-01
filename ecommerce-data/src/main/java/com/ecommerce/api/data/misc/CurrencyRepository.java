package com.ecommerce.api.data.misc;


import com.ecommerce.api.entity.misc.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {

}
