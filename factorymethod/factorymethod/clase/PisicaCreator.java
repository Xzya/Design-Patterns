package factorymethod.clase;

import factorymethod.interfete.IAnimal;
import factorymethod.interfete.IAnimalCreator;

public class PisicaCreator implements IAnimalCreator {

    @Override
    public IAnimal createObject() {
        return new Pisica();
    }

}
