package parkmanager;

import static org.junit.Assert.assertEquals;

import static parkmanager.utils.StringUtils.WEIGHT_MESSAGE;

import org.junit.Test;

public class MealPlannerTest {

    @Test
    public void testDinosaurMealPlanner() {
        final var littlefoot =
                Dinosaur.builder()
                        .name("Littlefoot")
                        .age(5)
                        .species("Apatosaurus")
                        .diet(Diet.HERBIVORE)
                        .weight(2121)
                        .build();

        final var mealPlanner = new MealPlanner(littlefoot);

        final int weightProportion = 5;
        final var numberOfFeedings = 2;
        final double amountOfFood = weightProportion * littlefoot.getWeight() / 100;
        final var servePerFeeding = amountOfFood / numberOfFeedings;
        final var expectedMessage =
                WEIGHT_MESSAGE.formatted(littlefoot.getWeight(), amountOfFood, servePerFeeding);

        assertEquals(expectedMessage, mealPlanner.calculateMeal());
    }
}
