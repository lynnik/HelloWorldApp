package com.lynnik.helloworldapp.factory;

public class EveningPartFactory implements PartFactory {

  public Part createPart() {
    return new EveningPart();
  }
}