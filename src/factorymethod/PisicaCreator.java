package factorymethod;


public class PisicaCreator implements IAnimalCreator {

    @Override
    public IAnimal createObject() {
        return new Pisica();
    }

}
