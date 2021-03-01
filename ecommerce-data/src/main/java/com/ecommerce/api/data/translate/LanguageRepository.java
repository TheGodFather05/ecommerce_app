package com.ecommerce.api.data.translate;


import com.ecommerce.api.entity.translate.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Long> {

}
