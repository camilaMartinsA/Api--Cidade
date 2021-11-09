package com.github.camilaMartinsA.countries.repositories;

import com.github.camilaMartinsA.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
