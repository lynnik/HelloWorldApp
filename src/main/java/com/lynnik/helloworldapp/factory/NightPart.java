package com.lynnik.helloworldapp.factory;

import com.lynnik.helloworldapp.Message;

public class NightPart extends PartResources implements Part {

  public void createMessage() {
    getMessage(Message.MESSAGE_NIGHT);
  }
}