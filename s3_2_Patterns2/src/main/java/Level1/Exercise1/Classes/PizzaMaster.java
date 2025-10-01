package Level1.Exercise1.Classes;

public class PizzaMaster {
    public Pizza buildCarbonara(RealPizzaBuilder builder){

        Topping onion = new Topping("Onion", 200,"g", Topping.familyTopping.VEGETABLES);
        Topping cookingCream = new Topping("Cooking Cream", 150, "mL", Topping.familyTopping.CHEESE);
        Topping mozzarella = new Topping("Mozzarella", 100, "g", Topping.familyTopping.CHEESE);
        Topping bacon = new Topping("Bacon", 70, "g", Topping.familyTopping.MEAT);
        Topping chicken = new Topping("Chicken", 50 , "g", Topping.familyTopping.MEAT);
        Topping egg = new Topping("Egg", 1, "unit", Topping.familyTopping.MEAT);

       builder.setSize(Pizza.Size.MEDIUM);
       builder.setDough(Pizza.DoughType.NEAPOLITAN);
       builder.setPizzaToppings(onion,cookingCream, mozzarella, bacon, chicken,egg);

      return builder.createPizza();
    }
    public Pizza FourSeasonsBuilder(RealPizzaBuilder builder){

        Topping tomatoSauce = new Topping("Tomato Sauce", 100, "mL", Topping.familyTopping.SAUCE);
        Topping mozzarella = new Topping("Mozzarella", 150, "g", Topping.familyTopping.CHEESE);
        Topping artichokes = new Topping("Artichokes", 60, "g", Topping.familyTopping.VEGETABLES);
        Topping bellPeppers = new Topping("Bell Peppers", 50, "g", Topping.familyTopping.VEGETABLES);
        Topping basil = new Topping("Fresh Basil", 15, "g", Topping.familyTopping.HERBS_SPICES);
        Topping mushrooms = new Topping("Mushrooms", 80, "g", Topping.familyTopping.VEGETABLES);
        Topping blackOlives = new Topping("Black Olives", 40, "g", Topping.familyTopping.VEGETABLES);
        Topping ham = new Topping("Prosciutto Cotto", 60, "g", Topping.familyTopping.MEAT);
        Topping boiledEggs = new Topping("Boiled Eggs", 2, "units", Topping.familyTopping.MEAT);

        builder.setSize(Pizza.Size.LARGE);
        builder.setDough(Pizza.DoughType.NEWYORK);
        builder.setPizzaToppings(tomatoSauce, mozzarella,artichokes,bellPeppers,basil,mushrooms,blackOlives,ham,boiledEggs);

        return builder.createPizza();
    }
    public Pizza RomanPizzaBuilder(RealPizzaBuilder builder){

        Topping tomatoSauce = new Topping("Tomato Sauce", 100, "mL", Topping.familyTopping.SAUCE);
        Topping mozzarella = new Topping("Mozzarella di Bufala", 120, "g", Topping.familyTopping.CHEESE);
        Topping oregano = new Topping("Oregano", 5, "g", Topping.familyTopping.HERBS_SPICES);
        Topping basil = new Topping("Fresh Basil", 10, "g", Topping.familyTopping.HERBS_SPICES);
        Topping oliveOil = new Topping("Extra Virgin Olive Oil", 20, "mL", Topping.familyTopping.SAUCE);
        Topping anchovies = new Topping("Anchovies", 30, "g", Topping.familyTopping.FISH);

        builder.setSize(Pizza.Size.EXTRA_LARGE);
        builder.setDough(Pizza.DoughType.CHICAGO);
        builder.setPizzaToppings(tomatoSauce, mozzarella,oregano,basil,oliveOil,anchovies);

        return builder.createPizza();
    }
    public Pizza BarbacuePizzaBuilder(RealPizzaBuilder builder){

        Topping tomatoSauce = new Topping("Tomato Sauce", 100, "mL", Topping.familyTopping.SAUCE);
        Topping mozzarella = new Topping("Mozzarella di Bufala", 120, "g", Topping.familyTopping.CHEESE);
        Topping chicken = new Topping("Chicken", 70 , "g", Topping.familyTopping.MEAT);
        Topping onion = new Topping("Onion", 200,"g", Topping.familyTopping.VEGETABLES);
        Topping bacon = new Topping("Bacon", 70, "g", Topping.familyTopping.MEAT);
        Topping barbacueSauce = new Topping("Barbacue Sauce", 20, "mL", Topping.familyTopping.SAUCE);

        builder.setSize(Pizza.Size.SMALL);
        builder.setDough(Pizza.DoughType.CANOTTO);
        builder.setPizzaToppings(tomatoSauce,mozzarella,chicken,onion,bacon,barbacueSauce);

        return builder.createPizza();


    }
}
