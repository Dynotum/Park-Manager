package parkmanager;

import static org.junit.Assert.assertTrue;
import static parkmanager.utils.StringUtils.OPENING_HOURS;
import static parkmanager.utils.StringUtils.SAFETY_MESSAGE;
import static parkmanager.utils.StringUtils.WELCOME_MESSAGE;

import org.junit.Test;

public class MainTest {

    @Test
    public void testWelcomeMessage() {
        assertTrue(WELCOME_MESSAGE.contains("WELCOME TO MESOZOIC EDEN"));
    }

    @Test
    public void testOpeningHoursMessage() {
        assertTrue(OPENING_HOURS.contains("OPENING HOURS"));
        assertTrue(OPENING_HOURS.contains("Monday to Friday"));
        assertTrue(OPENING_HOURS.contains("Weekends"));
    }

    @Test
    public void testSafetyMessage() {
        assertTrue(SAFETY_MESSAGE.contains("SAFETY MESSAGE"));
        assertTrue(SAFETY_MESSAGE.contains("Please do not feed the dinosaurs"));
    }
}
