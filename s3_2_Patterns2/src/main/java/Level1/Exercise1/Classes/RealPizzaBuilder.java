package Level1.Exercise1.Classes;

import Level1.Exercise1.Interfaces.PizzaBuilder;

import java.util.ArrayList;
import java.util.Collections;

public class RealPizzaBuilder implements PizzaBuilder {

    private Pizza.Size SIZE;
    private Pizza.DoughType DOUGHCHOSEN;
    public ArrayList<Topping> TOPPINGS;

    public RealPizzaBuilder(){
        this.TOPPINGS = new ArrayList<>();
    }
    @Override
    public PizzaBuilder setSize(Pizza.Size size) {
        this.SIZE = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(Pizza.DoughType dough) {
        this.DOUGHCHOSEN = dough;
        return this;
    }

    @Override
    public PizzaBuilder setPizzaToppings(Topping... topping) {
        Collections.addAll(this.TOPPINGS, topping);
        return this;
    }

    @Override
    public Pizza createPizza() {
        return new Pizza(SIZE,DOUGHCHOSEN,TOPPINGS);
    }
}
