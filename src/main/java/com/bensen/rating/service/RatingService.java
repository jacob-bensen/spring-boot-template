package com.bensen.rating.service;

import com.bensen.rating.model.Game;
import com.bensen.rating.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service @AllArgsConstructor
public class RatingService {

    private final RatingRepository ratingRepository;


    public Game saveGame(Game game) {
        return ratingRepository.saveGame(game);
    }
}
