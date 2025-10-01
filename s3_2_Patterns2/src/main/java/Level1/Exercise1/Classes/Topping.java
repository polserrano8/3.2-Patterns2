package Level1.Exercise1.Classes;

public class Topping {
    private String toppingName;
    private int quantity;
    private String units;
    public enum familyTopping{MEAT,CHEESE,VEGETABLES,SAUCE,HERBS_SPICES,FISH};
    private familyTopping familyTop;


    public Topping(String name, int quantity, String units, familyTopping familyTopping){
        this.toppingName = name;
        this.quantity = quantity;
        this.units = units;
        this.familyTop = familyTopping;
    }

    @Override
    public String toString() {
        return "\nTopping:" + "\n"+
                "Topping Name: '" + toppingName + '\'' +",\n"+
                "Quantity Selected: " + quantity + ",\n"+
                "Units: '" + units + '\'' +  ",\n"+
                "Family: " + familyTop + "\n";
    }
}
