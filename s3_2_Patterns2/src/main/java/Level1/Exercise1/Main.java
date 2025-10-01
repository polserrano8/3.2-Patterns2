package Level1.Exercise1;

import Level1.Exercise1.Classes.Pizza;
import Level1.Exercise1.Classes.PizzaMaster;
import Level1.Exercise1.Classes.RealPizzaBuilder;
import Level1.Exercise1.Classes.Topping;

public class Main {
    public static void main(String[] args) {

        PizzaMaster pizzaMaster = new PizzaMaster();


        RealPizzaBuilder builder = new RealPizzaBuilder();


        System.out.println("\nCarbonara Pizza");
        Pizza carbonara = pizzaMaster.buildCarbonara(builder);
        System.out.println(carbonara.toString());


        builder = new RealPizzaBuilder();


        System.out.println("\nFour Seasons Pizza");
        Pizza fourSeasons = pizzaMaster.FourSeasonsBuilder(builder);
        System.out.println(fourSeasons.toString());

        builder = new RealPizzaBuilder();

        System.out.println("\nRoman Pizza");
        Pizza romanPizza = pizzaMaster.RomanPizzaBuilder(builder);
        System.out.println(romanPizza.toString());

        builder = new RealPizzaBuilder();

        System.out.println("\nBarbecue Pizza");
        Pizza barbacuePizza = pizzaMaster.BarbacuePizzaBuilder(builder);
        System.out.println(barbacuePizza.toString());

        builder = new RealPizzaBuilder();
        System.out.println("\nPersonalized Pizza");

        Topping tomatoSauce = new Topping("Tomato Sauce", 100, "mL", Topping.familyTopping.SAUCE);
        Topping mozzarella = new Topping("Mozzarella", 150, "g", Topping.familyTopping.CHEESE);
        Topping pepperoni = new Topping("Pepperoni", 80, "g", Topping.familyTopping.MEAT);

        Pizza customPizza = builder
                .setSize(Pizza.Size.MEDIUM)
                .setDough(Pizza.DoughType.NEWYORK)
                .setPizzaToppings(tomatoSauce, mozzarella, pepperoni)
                .createPizza();

        System.out.println(customPizza.toString());

        System.out.println("\n" + "=".repeat(80));
        System.out.println("¡All pizzas have been created successfully!");
        System.out.println("=".repeat(80));
    }
}
