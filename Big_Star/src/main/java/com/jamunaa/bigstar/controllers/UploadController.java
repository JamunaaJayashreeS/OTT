
package com.jamunaa.bigstar.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jamunaa.bigstar.dto.MovieDto;

/**
 * @author JUE1COB
 */
@RestController
public class UploadController {


  /**
   * @param movieDto
   * @param request
   * @return
   */
  @GetMapping(value = "/upload")
  @ResponseStatus(HttpStatus.OK)
  @CrossOrigin
  public boolean uploadMovie(@RequestBody final MovieDto movieDto, final HttpServletRequest request) {
    return true;

  }
}
