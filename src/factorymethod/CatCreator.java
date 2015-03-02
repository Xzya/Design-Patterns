package factorymethod;


public class CatCreator implements IAnimalCreator {

    @Override
    public IAnimal createObject() {
        return new Cat();
    }

}
