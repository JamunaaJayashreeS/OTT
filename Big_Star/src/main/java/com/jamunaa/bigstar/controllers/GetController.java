
package com.jamunaa.bigstar.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jamunaa.bigstar.dto.MovieDto;
import com.jamunaa.bigstar.repository.MovieRepository;
import com.jamunaa.bigstar.services.MoviesService;

/**
 * @author JUE1COB
 */
@RestController
public class GetController {

  @Autowired
  MoviesService moviesService;

  @Autowired
  MovieRepository movieRepo;

  /**
   * @param movieDto
   * @param request
   * @return
   */
  @GetMapping(value = "/getMoview")
  @ResponseStatus(HttpStatus.OK)
  @CrossOrigin
  public List<MovieDto> getAllMovies(final HttpServletRequest request) {
    return (List<MovieDto>) this.movieRepo.findAll();

  }

  @GetMapping("/movie/{movieid}")
  public Optional<MovieDto> getBooks(@PathVariable("movieid") final int movieid) {
    return this.movieRepo.findById(movieid);
  }

  // creating a delete mapping that deletes a specified book
  @DeleteMapping("/movie/{movieid}")
  public void deleteBook(@PathVariable("movieid") final int bookid) {
    this.moviesService.delete(bookid);
  }

  // creating post mapping that post the book detail in the database
  @PostMapping("/movies")
  public int saveBook(@RequestBody final MovieDto movie) {
    this.moviesService.saveOrUpdate(movie);
    return movie.getId();
  }

  // creating put mapping that updates the book detail
  @PutMapping("/movies")
  public MovieDto update(@RequestBody final MovieDto movie) {
    this.moviesService.saveOrUpdate(movie);
    return movie;
  }
}
