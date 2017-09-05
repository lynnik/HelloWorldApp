package com.lynnik.helloworldapp.factory;

public class MorningPartFactory implements PartFactory {

  public Part createPart() {
    return new MorningPart();
  }
}