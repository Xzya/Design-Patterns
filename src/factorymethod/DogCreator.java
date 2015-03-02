package factorymethod;


public class DogCreator implements IAnimalCreator {

    @Override
    public IAnimal createObject() {
        return new Dog();
    }

}
