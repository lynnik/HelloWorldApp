package com.lynnik.helloworldapp.factory;

public class DayPartFactory implements PartFactory {

  public Part createPart() {
    return new DayPart();
  }
}