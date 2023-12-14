package com.crick.api.Crickinformer.repositories;

import com.crick.api.Crickinformer.entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
    //provide match details using teamName
    Optional<Match> findByTeamHeading(String teamHeading);
}
