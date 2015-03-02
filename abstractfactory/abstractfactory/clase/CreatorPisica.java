package abstractfactory.clase;

import abstractfactory.interfete.IAnimalApa;
import abstractfactory.interfete.IAnimalCreator;
import abstractfactory.interfete.IAnimalPamant;

public class CreatorPisica implements IAnimalCreator {

    @Override
    public IAnimalApa createAnimalDeMare() {
        return new PisicaDeMare();
    }

    @Override
    public IAnimalPamant createAnimalDePamant() {
        return new Pisica();
    }

}
