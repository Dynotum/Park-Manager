package parkmanager;

import static parkmanager.utils.StringUtils.WEIGHT_MESSAGE;

public class MealPlanner {

    private final Dinosaur dinosaur;

    public MealPlanner(final Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }

    public String calculateMeal() {
        final int weightProportion = 5;
        final var numberOfFeedings = 2;
        final double amountOfFood = weightProportion * dinosaur.getWeight() / 100;
        final var servePerFeeding = amountOfFood / numberOfFeedings;
        return WEIGHT_MESSAGE.formatted(dinosaur.getWeight(), amountOfFood, servePerFeeding);
    }

    public void printMeal() {
        System.out.println(calculateMeal());
    }
}
