
package com.jamunaa.bigstar.constants;


/**
 * @author JUE1COB
 */
public class Constants {

  public static final String BLANK = " ";

  public static final String NEXTLINE = "\n";


  public static final String SUCCESS = "SUCCESS";

  public static final String SEMI_COLON = ";";


  public static final String CAUSE = "Cause :";

  public static final String AOP_LOGGER = "AOP_LOGGER";
  public static final String LOG4J_FILE_PATH = "../log4j.properties";

  public static final String date_format = "yyyy.MM.dd HH:mm";

  public static final String INPUT_DTO_NULL = "Input DTO is NULL";


  public static final String FAILURE = "FAILURE";


  public static final String CONNECTION_FAILURE = "CONNECTION_FAILURE";


  public static final String AUTHENTICATIONFAILURE = "AUTHENTICATIONFAILURE";
  /**
   * Password bit key
   */
  public static final String PASSWORD_BIT_KEY = "12345678";

  /**
   * password ecryption byte code pattern
   */
  public static final String PASSWORD_IV_BYTES_CODE = "input123";

  /**
   * DES pattern type
   */
  public static final String DES_PADDING_FORMAT = "DES/CTR/NoPadding";


  public static final String FILEPATH = "\\configproperties.txt";

  public static final String API_DOC_SET_PASS = "Accepts plain text password of system user as input." +
      " Returns status as success if correct password is given and it is updated to the running instance." +
      " Returns status as failure if incorrect password is given.";

  public static final String API_DOC_SAVE_WI = "Save form data into configured workitem(compliance)";

  public static final String API_DOC_RTC_CONT = "Operations pertaining to RTC API calls";

  public static final String API_DOC_MODEL_PASSWORD = "Plain text password to be updated for the system user. " +
      "Password will be updated only if the correct value is given. Wrong password will " +
      "not get updated and would return status as failure.";

  public static final String API_DOC_MODEL_PASSWORD_STATUS = "Status of operation. Returns success or failure." +
      " Only output attribute and not considered when given as input to post.";

  public static final String API_DOC_MODEL_WI_ID = "Workitem ID returned from RTC. Do not send this in the request.";


  /**
   * LDAP User details
   */

  /** Given name */
  public static final String GIVEN_NAME = "givenname";
  /** Sur name */
  public static final String SUR_NAME = "sn";
  /** Mail */
  public static final String EMAIL_ADDRESS = "mail";

  public static final String DEPARTMENT = "department";

  /** Search filter */
  public static final String ACCOUNT_NAME = "sAMAccountName=";

  /** LDAP Connection Success message */
  public static final String SUCCESS_LDAP_CONN_MSG =
      "Successfully established connection with LDAP and retrieved the context !!";

  /** LDAP Connection Failure message */
  public static final String FAILURE_LDAP_CONN_MSG = "Unable to connect to the LDAP server !!";

  /** LDAP Error in fetch user infromations */
  public static final String LDAP_WARN_USER_INFO = "Unable to fetch information from LDAP related to user {0} !!";

  /** LDAP Error in fetch user infromations */
  public static final String LDAP_ERR_USER_INFO = "LDAP search failed while fetching the user info {0}!!";


}
