package Level1.Exercise1.Classes;

import java.util.ArrayList;


public class Pizza {
    public final Size SIZE;
    public  final DoughType DOUGHCHOSEN;
    public ArrayList<Topping> TOPPINGS;

    public enum Size {
        SMALL(8),
        MEDIUM(12),
        LARGE(16),
        EXTRA_LARGE(20);

        private final int INCHES;

        Size(int inches) {
            this.INCHES = inches;
        }
    }

    public enum DoughType {
        NEAPOLITAN("Neapolitan"),
        NEWYORK("New York"),
        CHICAGO("Chicago"),
        ROMAN("Roman"),
        CANOTTO("Canott");

        private final String DESCRIPTION;

        DoughType(String description) {
            this.DESCRIPTION = description;
        }
    }
    public Pizza(Size pizzaSize, DoughType doughSelected, ArrayList<Topping> toppingsSelected){
        this.SIZE = pizzaSize;
        this.DOUGHCHOSEN = doughSelected;
        this.TOPPINGS = toppingsSelected;
    }

    @Override
    public String toString() {
        return "Pizza{ \n" +
                "Size: " + SIZE + ", \n" +
                "Dough Selected: " + DOUGHCHOSEN + ", \n" +
                "List of Toppings: " + TOPPINGS + ", \n" +
                TOPPINGS.toString()+
                "} \n";
    }
}
