import com.lynnik.helloworldapp.factory.DayPartFactory;
import com.lynnik.helloworldapp.factory.EveningPartFactory;
import com.lynnik.helloworldapp.factory.MorningPartFactory;
import com.lynnik.helloworldapp.factory.NightPartFactory;
import junit.framework.TestCase;
import org.junit.Test;

public class PartFactory {

  @Test
  public void testMorningPartFactory() {
    MorningPartFactory factory = new MorningPartFactory();

    TestCase.assertNotNull("assertNotNull MorningPartFactory", factory.createPart());
  }

  @Test
  public void testDayPartFactory() {
    DayPartFactory factory = new DayPartFactory();

    TestCase.assertNotNull("assertNotNull DayPartFactory", factory.createPart());
  }

  @Test
  public void testEveningPartFactory() {
    EveningPartFactory factory = new EveningPartFactory();

    TestCase.assertNotNull("assertNotNull EveningPartFactory", factory.createPart());
  }

  @Test
  public void testNightPartFactory() {
    NightPartFactory factory = new NightPartFactory();

    TestCase.assertNotNull("assertNotNull NightPartFactory", factory.createPart());
  }
}