package factorymethod;


public class CaineCreator implements IAnimalCreator {

    @Override
    public IAnimal createObject() {
        return new Caine();
    }

}
