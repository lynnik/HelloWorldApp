package com.lynnik.helloworldapp.factory;

import com.lynnik.helloworldapp.Message;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public class PartResources {

  protected static final Logger log = Logger.getLogger(PartResources.class);

  public void getMessage(String resourcesFile) {
    ResourceBundle resourceBundle = ResourceBundle.getBundle(Message.MESSAGES);
    String message = resourceBundle.getString(resourcesFile);
    try {
      String decodedMessage = new String(message.getBytes(Message.CHARSET_FROM), Message.CHARSET_TO);
      System.out.println(decodedMessage);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}