package pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE};
    Set<Topping> toppings = null;

    public abstract static class Builder {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public Builder addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public Builder sauceInside(){
            return self();
        }

        public abstract Pizza build();
        protected abstract Builder self();

    }

    Pizza(Builder builder){
        toppings = builder.toppings.clone();
    }

    public String toString() {
        return toppings.toString();
    }

    

}
