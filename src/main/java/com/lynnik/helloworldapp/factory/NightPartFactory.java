package com.lynnik.helloworldapp.factory;

public class NightPartFactory implements PartFactory {

  public Part createPart() {
    return new NightPart();
  }
}