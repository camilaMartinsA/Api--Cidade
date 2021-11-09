package com.github.camilaMartinsA.citiesapi;

import com.github.camilaMartinsA.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/countryes")
public class CountryResouce {
    private CountryRepository repository;
    
@GetMapping
    public List<Country> contries(){
        return repository.findAll();
    }
}
