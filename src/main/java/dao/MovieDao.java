package dao;

import entities.Movie;

import java.util.List;

public interface MovieDao {

    List<Movie> findAllMovies();

}
