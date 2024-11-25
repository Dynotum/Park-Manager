package parkmanager;

import static parkmanager.utils.StringUtils.PROFILE_MESSAGE;

import java.util.Locale;

public class Dinosaur {

    private final String name;
    private final int age;
    private final String species;
    private final Diet diet;
    private final double weight;

    private Dinosaur(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.species = builder.species;
        this.diet = builder.diet;
        this.weight = builder.weight;
    }

    protected String getProfile() {
        return String.format(
                PROFILE_MESSAGE, name, age, species, diet.name().toLowerCase(Locale.ROOT), weight);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Diet getDiet() {
        return diet;
    }

    public double getWeight() {
        return weight;
    }

    public static final class Builder {
        private String name;
        private int age;
        private String species;
        private Diet diet;
        private double weight;

        private Builder() {}

        public static Builder builder() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder species(String species) {
            this.species = species;
            return this;
        }

        public Builder diet(Diet diet) {
            this.diet = diet;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Dinosaur build() {
            return new Dinosaur(this);
        }
    }
}
