package factorymethod;


public class Dog implements IAnimal {

    @Override
    public String makeSound() {
        return "Bark ";
    }

}
