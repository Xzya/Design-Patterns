package simplefactory;

import simplefactory.Caine;

public class AnimalFactory {
    
    public Animal createInstance(Animal animal) {
        if (animal.getClass() == Caine.class) {
            return new Caine();
        } else if (animal.getClass() == Pisica.class) {
            return new Pisica();
        } else if (animal.getClass() == Hamster.class) {
            return new Hamster();
        }
        return null;
    }

}
