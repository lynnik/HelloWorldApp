package com.lynnik.helloworldapp.factory;

import com.lynnik.helloworldapp.Message;

public class MorningPart extends PartResources implements Part {

  public void createMessage() {
    getMessage(Message.MESSAGE_MORNING);
    log.info("Создано сообщение: " + Message.MESSAGE_MORNING);
  }
}