package com.devsuperior.dslist.respositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRespository extends JpaRepository<GameList, Long> {
}
