package simplefactory;


public class Hamster implements Animal {

    @Override
    public String toString() {
        return "I'm a " + this.getClass().getSimpleName();
    }
    
}
