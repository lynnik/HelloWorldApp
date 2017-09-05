package com.lynnik.helloworldapp.factory;

import com.lynnik.helloworldapp.Message;

public class EveningPart extends PartResources implements Part {

  public void createMessage() {
    getMessage(Message.MESSAGE_EVENING);
    log.info("Создано сообщение: " + Message.MESSAGE_EVENING);
  }
}