
package com.jamunaa.bigstar.controllers;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jamunaa.bigstar.constants.Constants;
import com.jamunaa.bigstar.dto.PasswordDTO;
import com.jamunaa.bigstar.services.PasswordEncryption;

import io.swagger.annotations.ApiOperation;

/**
 * @author JUE1COB
 */

@RestController
public class LoginController {

  @Value("${id}")
  private String id;

  @Value("${pwd}")
  private String pwd;

  @Autowired
  private PasswordEncryption passwordEncryption;

  /**
   * @param userId is userId
   * @param pwd is admin owd
   * @param request is {@link HttpRequest}
   * @return is UserDTO Information about the current logged in user
   * @throws IOException
   * @throws GeneralSecurityException
   */
  @GetMapping(value = "/admin")
  @ResponseStatus(HttpStatus.OK)
  @CrossOrigin
  public boolean adminLogin(@RequestHeader("userId") final String userId, @RequestHeader("password") final String pwd,
      final HttpServletRequest request)
      throws GeneralSecurityException, IOException {

    return (userId.contentEquals(this.id) &&
        pwd.contentEquals(PasswordEncryption.loadProperty("classpath:" + Constants.FILEPATH)));

  }

  /**
   * @param passwordDTO
   * @return
   * @throws Exception
   */
  @PostMapping(value = "/passwordForSystemUser")
  @ResponseStatus(HttpStatus.OK)
  @ApiOperation(value = Constants.API_DOC_SET_PASS, response = PasswordDTO.class)
  public PasswordDTO setPassword(@RequestBody final PasswordDTO passwordDTO) throws Exception {

    return this.passwordEncryption.setPassword(passwordDTO);
  }

}
