package simplefactory;


public class Pisica implements Animal {

    @Override
    public String toString() {
        return "Sunt un " + this.getClass().getSimpleName();
    }
    
}
