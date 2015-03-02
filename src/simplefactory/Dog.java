package simplefactory;


public class Dog implements Animal {

    @Override
    public String toString() {
        return "I'm a " + this.getClass().getSimpleName();
    }
    
}
