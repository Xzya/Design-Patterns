package decorator;

abstract class ToppingDecorator implements IPizza {

    protected IPizza tempPizza;
    
    public ToppingDecorator(IPizza newPizza) {
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        return tempPizza.getDescription();
    }
    
    public double getCost() {
        return tempPizza.getCost();
    }
    
}
