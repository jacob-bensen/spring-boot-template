package com.bensen.rating.controller;

import com.bensen.rating.model.Game;
import com.bensen.rating.service.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller @AllArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    @PostMapping
    public Game saveGame(Game game) {
         return ratingService.saveGame(game);
    }


}
