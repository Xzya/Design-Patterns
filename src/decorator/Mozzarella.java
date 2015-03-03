package decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(IPizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozarella";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
    
}
