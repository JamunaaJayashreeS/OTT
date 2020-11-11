
package com.jamunaa.bigstar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamunaa.bigstar.dto.MovieDto;
import com.jamunaa.bigstar.repository.MovieRepository;

/**
 * @author JUE1COB
 */

@Service
public class MoviesService {

  @Autowired
  MovieRepository movieRepository;


  /**
   * @return
   */
  public List<MovieDto> getAllMovies() {
    List<MovieDto> movies = new ArrayList<MovieDto>();
    this.movieRepository.findAll().forEach(movie -> movies.add(movie));
    return movies;
  }

  public MovieDto getMoviesById(final int id) {
    return this.movieRepository.findById(id).get();
  }

  // saving a specific record by using the method save() of CrudRepository
  public void saveOrUpdate(final MovieDto movie) {
    this.movieRepository.save(movie);
  }

  // deleting a specific record by using the method deleteById() of CrudRepository
  public void delete(final int id) {
    this.movieRepository.deleteById(id);
  }

  // updating a record
  public void update(final MovieDto movie, final int movieId) {
    this.movieRepository.save(movie);
  }

}
