
package com.jamunaa.bigstar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jamunaa.bigstar.dto.MovieDto;

/**
 * @author JUE1COB
 */
@Repository
public interface MovieRepository extends CrudRepository<MovieDto, Integer> {

  /**
   * @return
   */
  // List<MovieDto> getAllMovies();
}
