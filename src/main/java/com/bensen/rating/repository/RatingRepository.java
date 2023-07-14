package com.bensen.rating.repository;

import com.bensen.rating.model.Game;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository @AllArgsConstructor
public class RatingRepository {

    private final DSLContext jooq;

    public Game saveGame(Game game) {

        //TODO: insert game
        //TODO: update ratings if needed
        return game;
    }


}
