
package com.jamunaa.bigstar.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * @author JUE1COB
 */


@Getter
@Setter
@Entity
@Table(name = "MovieDto")
public class MovieDto {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String movieName;
  @Column
  private String language;
  @Column
  private String genre;
  @Column
  private Integer rating;
  @Column
  private Date releaseDate;


  public MovieDto() {

  }

}
