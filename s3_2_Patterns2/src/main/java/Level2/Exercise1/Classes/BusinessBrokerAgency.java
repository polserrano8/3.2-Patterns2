package Level2.Exercise1.Classes;

import Level2.Exercise1.Interfaces.Observer;
import Level2.Exercise1.Interfaces.Subject;

public class BusinessBrokerAgency implements Observer {

    private double stock1;
    private double stock2;
    private double stock3;
    private Subject businessBroker;

    public BusinessBrokerAgency(Subject businessBroker){
        this.businessBroker = businessBroker;
        businessBroker.registerObserver(this);
    }


    @Override
    public void update(double stock1, double stock2, double stock3) {
        this.stock1 = stock1;
        this.stock2 = stock2;
        this.stock3 = stock3;
    }

    @Override
    public void display() {
        System.out.println("\nThe state of the stocks are the following");
        System.out.println(businessBroker.toString());
    }
}
