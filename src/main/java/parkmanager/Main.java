package parkmanager;

import static parkmanager.utils.StringUtils.OPENING_HOURS;
import static parkmanager.utils.StringUtils.SAFETY_MESSAGE;
import static parkmanager.utils.StringUtils.WELCOME_MESSAGE;

public class Main {
    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);
        System.out.println(OPENING_HOURS);
        System.out.println(SAFETY_MESSAGE);
        System.out.println();
        final var littlefoot =
                Dinosaur.builder()
                        .name("Littlefoot")
                        .age(5)
                        .species("Apatosaurus")
                        .diet(Diet.HERBIVORE)
                        .weight(212.5)
                        .build();

        System.out.println(littlefoot.getProfile());
    }
}
