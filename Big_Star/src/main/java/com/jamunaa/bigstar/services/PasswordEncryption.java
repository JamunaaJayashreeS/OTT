/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.jamunaa.bigstar.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.security.GeneralSecurityException;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.jamunaa.bigstar.constants.Constants;
import com.jamunaa.bigstar.dto.PasswordDTO;


@Service
public class PasswordEncryption {


  /**
   * @param passwordDTO
   * @return
   * @throws IOException
   * @throws TeamRepositoryException
   */
  public PasswordDTO setPassword(PasswordDTO passwordDTO) throws IOException {


    if (null == passwordDTO) {
      passwordDTO = new PasswordDTO();
      passwordDTO.setStatus("failure");
      passwordDTO.setPassword("");
      return passwordDTO;
    }

    String passwordValue = passwordDTO.getPassword();
    StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
    encryptor.setPassword(Constants.PASSWORD_BIT_KEY);
    String encryptedPassword = encryptor.encrypt(passwordValue);
    File file = ResourceUtils.getFile("classpath:" + Constants.FILEPATH);
    FileWriter fileWriter = new FileWriter(file);
    fileWriter.write(encryptedPassword);
    fileWriter.close();
    passwordDTO.setStatus("success");
    return passwordDTO;


  }


  /**
   * @param filePath
   * @return
   * @throws GeneralSecurityException
   * @throws IOException
   */
  public static String loadProperty(final String filePath) throws GeneralSecurityException, IOException {
    File file = ResourceUtils.getFile(filePath);
    String passCode = new String(Files.readAllBytes(file.toPath()));
    return decryptPasskeyInDESFormatForByte(passCode);
  }


  /**
   * @return
   * @throws GeneralSecurityException
   * @throws IOException
   */
  public static String decryptPasskeyInDESFormatForByte(final String ipText)
      throws GeneralSecurityException, IOException {
    StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
    decryptor.setPassword(Constants.PASSWORD_BIT_KEY);
    return decryptor.decrypt(ipText);

  }
}
