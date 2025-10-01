package Level2.Exercise1.Classes;

import Level2.Exercise1.Interfaces.Observer;
import Level2.Exercise1.Interfaces.Subject;

import java.util.ArrayList;

public class BusinessBroker implements Subject {

    private ArrayList observers;
    private double stock1;
    private double stock2;
    private double stock3;


    public BusinessBroker(double initialStock1, double initialStock2, double initialStock3){
        observers = new ArrayList();
        this.stock1 = initialStock1;
        this.stock2 = initialStock2;
        this.stock3 = initialStock3;
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }
    public void notifyObserver(){
        for(int i=0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(stock1,stock2,stock3);
        }
    }
    private void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(double stock1Actualized, double stock2Actualized, double stock3Actualized ){
        this.stock1 = stock1Actualized;
        this.stock2 = stock2Actualized;
        this.stock3 = stock3Actualized;
        measurementsChanged();
    }

    @Override
    public String toString() {
        return  "Value of Stock 1: " + stock1 + "€ \n"+
                "Value of Stock 2: " + stock2 + "€ \n"+
                "Value of Stock 3: " + stock3 + "€ \n"+
                "Keep looking for further actualizations.";
    }
}
