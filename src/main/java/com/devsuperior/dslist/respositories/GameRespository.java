package com.devsuperior.dslist.respositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRespository  extends JpaRepository<Game, Long> {
}
