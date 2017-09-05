package com.lynnik.helloworldapp;

import com.lynnik.helloworldapp.factory.*;
import org.apache.log4j.Logger;

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

  private static final Logger log = Logger.getLogger(Message.class);

  public void getMessage() {
    PartFactory factory = createPart(getCurrentTimeInHours());
    Part part = factory.createPart();
    part.createMessage();
  }

  private PartFactory createPart(int time) {
    if (time >= MORNING && time < DAY) {
      log.info("Создан екземпляр: MorningPartFactory");
      return new MorningPartFactory();
    } else if (time >= DAY && time < EVENING) {
      log.info("Создан екземпляр: DayPartFactory");
      return new DayPartFactory();
    } else if (time >= EVENING && time < NIGHT) {
      log.info("Создан екземпляр: EveningPartFactory");
      return new EveningPartFactory();
    } else if ((time >= MIDNIGHT && time < MORNING) || (time == NIGHT)) {
      log.info("Создан екземпляр: NightPartFactory");
      return new NightPartFactory();
    } else {
      log.error("RuntimeException " + time + " - unsupported time.");
      throw new RuntimeException(time + " - unsupported time.");
    }
  }

  private int getCurrentTimeInHours() {
    Calendar calendar = Calendar.getInstance();
    int currentTimeInHours = calendar.get(Calendar.HOUR_OF_DAY);
    log.info("currentTimeInHours: " + currentTimeInHours);
    return currentTimeInHours;
  }
}