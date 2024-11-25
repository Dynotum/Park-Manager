package parkmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static parkmanager.utils.StringUtils.OPENING_HOURS;
import static parkmanager.utils.StringUtils.PROFILE_MESSAGE;
import static parkmanager.utils.StringUtils.SAFETY_MESSAGE;
import static parkmanager.utils.StringUtils.WELCOME_MESSAGE;

import org.junit.Test;

import java.util.Locale;

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

    @Test
    public void testDinosaurProfileMessage() {
        final var name = "Littlefoot";
        final var age = 5;
        final var species = "Apatosaurus";
        final var diet = Diet.HERBIVORE;
        final var weight = 212.5;
        final var message =
                PROFILE_MESSAGE.formatted(
                        name, age, species, diet.name().toLowerCase(Locale.ROOT), weight);

        final var littlefoot =
                Dinosaur.Builder.builder()
                        .name(name)
                        .age(age)
                        .species(species)
                        .diet(diet)
                        .weight(weight)
                        .build();

        // asserts primitive types
        assertEquals(name, littlefoot.getName());
        assertEquals(age, littlefoot.getAge());
        assertEquals(species, littlefoot.getSpecies());
        assertEquals(diet, littlefoot.getDiet());
        assertEquals(weight, littlefoot.getWeight(), weight);
        // asserts profile message
        assertEquals(message, littlefoot.getProfile());
    }
}
