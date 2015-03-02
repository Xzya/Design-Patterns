package simplefactory;


public class Cat implements Animal {

    @Override
    public String toString() {
        return "I'm a " + this.getClass().getSimpleName();
    }
    
}
