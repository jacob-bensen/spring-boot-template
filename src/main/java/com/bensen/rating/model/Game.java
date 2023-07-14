package com.bensen.rating.model;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Data @Builder
public class Game {

    UUID id;
    Set<UUID> teamOneIds;
    Set<UUID> teamTwoIds;
    GameResult result;
    OffsetDateTime beginDate;
    OffsetDateTime endDate;

}
