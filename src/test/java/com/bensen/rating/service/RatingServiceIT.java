package com.bensen.rating.service;

import com.bensen.rating.model.Game;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class RatingServiceIT {

    @Autowired RatingService ratingService;


    @Test
    void saveGame() {



        ratingService.saveGame(Game.builder().build());
        assertTrue(true);
    }
}
