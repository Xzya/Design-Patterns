package simplefactory;

import simplefactory.Dog;

public class AnimalFactory {
    
    public Animal createInstance(Animal animal) {
        if (animal.getClass() == Dog.class) {
            return new Dog();
        } else if (animal.getClass() == Cat.class) {
            return new Cat();
        } else if (animal.getClass() == Hamster.class) {
            return new Hamster();
        }
        return null;
    }

}
