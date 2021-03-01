package com.ecommerce.api.data.misc;


import com.ecommerce.api.entity.misc.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Long> {

}
