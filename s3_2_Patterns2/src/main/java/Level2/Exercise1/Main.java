package Level2.Exercise1;


import Level2.Exercise1.Classes.BusinessBroker;
import Level2.Exercise1.Classes.BusinessBrokerAgency;
import Level2.Exercise1.Interfaces.Observer;

public class Main {
    public static void main(String[] args) {

        BusinessBroker nasDaqBroker = new BusinessBroker(312.50, 30.5,23.99);
        Observer spanishBrokerAgency = new BusinessBrokerAgency(nasDaqBroker);

        spanishBrokerAgency.display();

        nasDaqBroker.registerObserver(spanishBrokerAgency);
        nasDaqBroker.setMeasurements( 313.5, 40.2, 12.0);

        spanishBrokerAgency.display();

    }
}