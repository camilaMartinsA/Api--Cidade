package com.github.camilaMartinsA.staties.repositories;

import com.github.camilaMartinsA.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
