package edu.dev.api.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.dev.api.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
