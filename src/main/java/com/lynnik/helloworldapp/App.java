package com.lynnik.helloworldapp;

import org.apache.log4j.Logger;

public class App {

  private static final Logger log = Logger.getLogger(App.class);

  public static void main(String[] args) {
    log.info("Приложение начало работу");
    Message message = new Message();
    message.getMessage();
  }
}