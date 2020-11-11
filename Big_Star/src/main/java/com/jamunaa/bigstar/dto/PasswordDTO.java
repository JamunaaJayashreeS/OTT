
package com.jamunaa.bigstar.dto;

import com.jamunaa.bigstar.constants.Constants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author JUE1COB
 */
@Api
public class PasswordDTO {


  @ApiModelProperty(notes = Constants.API_DOC_MODEL_PASSWORD, required = true)
  private String password;

  @ApiModelProperty(notes = Constants.API_DOC_MODEL_PASSWORD_STATUS, required = false)
  private String status;

  /**
   * @return the encryptedPassword
   */
  public String getPassword() {
    return this.password;
  }


  /**
   * @param encryptedPassword the encryptedPassword to set
   */
  public void setPassword(final String password) {
    this.password = password;
  }


  /**
   * @return the status
   */
  public String getStatus() {
    return this.status;
  }


  /**
   * @param status the status to set
   */
  public void setStatus(final String status) {
    this.status = status;
  }

}

