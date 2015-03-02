package abstractfactory.clase;

import abstractfactory.interfete.IAnimalApa;
import abstractfactory.interfete.IAnimalCreator;
import abstractfactory.interfete.IAnimalPamant;

public class CreatorCal implements IAnimalCreator {

    @Override
    public IAnimalApa createAnimalDeMare() {
        return new CalDeMare();
    }

    @Override
    public IAnimalPamant createAnimalDePamant() {
        return new Cal();
    }

}
