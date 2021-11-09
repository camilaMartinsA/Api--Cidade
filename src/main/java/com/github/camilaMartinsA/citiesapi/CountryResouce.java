package com.github.camilaMartinsA.citiesapi;

import com.github.camilaMartinsA.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/countryes")
public class CountryResouce {

    private CountryRepository repository;

    public CountryResouce(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> contries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/(id)")
    public ResponseEntity getOne (@PathVariable long id) {
        Optional <Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
