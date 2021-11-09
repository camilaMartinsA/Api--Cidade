package com.github.camilaMartinsA.citiesapi.countries.repository;

import com.github.camilaMartinsA.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
