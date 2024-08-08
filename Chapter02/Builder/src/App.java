import pizza.Calzone;
import pizza.NyPizza;
import pizza.Pizza;
import pizza.NyPizza.Size;
import pizza.Pizza.Topping;

public class App {
    public static void main(String[] args) throws Exception {
        Pizza nyPizza = new NyPizza.Builder(Size.SMALL)
                        .addTopping(Topping.HAM)
                        .addTopping(Topping.MUSHROOM)
                        .build();

        Pizza calzone = new Calzone.Builder()
                        .addTopping(Topping.ONION)
                        .sauceInside()
                        .build();

        System.out.println(nyPizza.toString());
        System.out.println(calzone.toString());
    }
}
