package simplefactory.clase;

import simplefactory.interfete.Animal;

public class Caine implements Animal {

    @Override
    public String toString() {
        return "Sunt un " + this.getClass().getSimpleName();
    }
    
}
