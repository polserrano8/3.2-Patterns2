package Level1.Exercise1.Interfaces;

import Level1.Exercise1.Classes.Pizza;
import Level1.Exercise1.Classes.Topping;

public interface PizzaBuilder {

    PizzaBuilder setSize(Pizza.Size size);
    PizzaBuilder setDough(Pizza.DoughType dough);
    PizzaBuilder setPizzaToppings(Topping... toppings);
    Pizza createPizza();



}
