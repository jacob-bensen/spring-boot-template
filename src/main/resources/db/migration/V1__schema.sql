create table if not exists player (
    id uuid primary key,
    name text not null,
    solo_rating int default 1000,
    team_rating int default 1000,
    modified_date timestamp with time zone not null default CURRENT_TIMESTAMP
);

create table if not exists game (
    id uuid primary key,
    team_one_player_ids uuid[] not null,
    team_two_player_ids uuid[] not null,
    status TEXT,
    begin_date timestamp with time zone not null default CURRENT_TIMESTAMP,
    end_date timestamp with time zone not null default CURRENT_TIMESTAMP
);
