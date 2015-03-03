package chainofresponsability;

/**
 * The object contains the two operands and the operation
 * to be performed.
 * 
 * @author Mihail Cristian Dumitru
 *
 */

public class Numbers {
    private int number1;
    private int number2;
    private String calculationWanted;

    public Numbers(int _number1, int _number2, String calcWanted) {
        number1 = _number1;
        number2 = _number2;
        calculationWanted = calcWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
