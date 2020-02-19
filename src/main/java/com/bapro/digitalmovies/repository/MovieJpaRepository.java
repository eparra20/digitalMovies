package com.bapro.digitalmovies.repository;

import com.bapro.digitalmovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface MovieJpaRepository extends JpaRepository<Movie,Integer> {
}
