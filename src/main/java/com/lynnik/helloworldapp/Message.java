package com.lynnik.helloworldapp;

import com.lynnik.helloworldapp.factory.*;

import java.util.Calendar;

public class Message {

  public static final String MESSAGES = "messages";
  public static final String MESSAGE_MORNING = "message.morning";
  public static final String MESSAGE_DAY = "message.day";
  public static final String MESSAGE_EVENING = "message.evening";
  public static final String MESSAGE_NIGHT = "message.night";

  public static final String CHARSET_FROM = "ISO-8859-1";
  public static final String CHARSET_TO = "UTF-8";

  private static final int MIDNIGHT = 0;
  private static final int MORNING = 6;
  private static final int DAY = 9;
  private static final int EVENING = 19;
  private static final int NIGHT = 23;

  public void getMessage() {
    PartFactory factory = createPart(getCurrentTimeInHours());
    Part part = factory.createPart();
    part.createMessage();
  }

  private PartFactory createPart(int time) {
    if (time >= MORNING && time < DAY)
      return new MorningPartFactory();
    else if (time >= DAY && time < EVENING)
      return new DayPartFactory();
    else if (time >= EVENING && time < NIGHT)
      return new EveningPartFactory();
    else if ((time >= MIDNIGHT && time < MORNING) || (time == NIGHT))
      return new NightPartFactory();
    else
      throw new RuntimeException(time + " - unsupported time.");
  }

  private int getCurrentTimeInHours() {
    Calendar calendar = Calendar.getInstance();
    return calendar.get(Calendar.HOUR_OF_DAY);
  }
}