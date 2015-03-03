package decorator;

public class PlainPizza implements IPizza {

    @Override
    public String getDescription() {
        return "Thin Doug";
    }

    @Override
    public double getCost() {
        return 4.00;
    }

}
