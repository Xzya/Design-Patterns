package adapter;

public class DogAdapter implements Thing{
    
    private Dog dog;
    
    public DogAdapter(Dog newDog) {
        dog = newDog;
    }

    @Override
    public String talk() {
        return dog.makeSound();
    }

}
