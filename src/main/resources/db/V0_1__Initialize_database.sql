create table team
(
    id      serial,
    name varchar,
    sponsor_id integer
            constraint team_sponsor_id_fk references "sponsor"(id),
    player_id integer
                constraint team_player_id_fk references "player"(id),
    primary key (id)
);

create table player
(
    id     serial,
    name varchar,
    number integer,
    primary key (id)
);

create table sponsor
(
    id     serial,
    name varchar,
    primary key id
);

create table play_against
(
    id serial,
    team1_id   integer   not null
          constraint play_against_team1_id_fk references "team"(id),
    team2_id   integer   not null
              constraint play_against_team2_id_fk references "team"(id),
    datetime date,
    stadium varchar,
    primary key id
);





