package decorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Doug";
    }

    @Override
    public double getCost() {
        return 4.00;
    }

}
