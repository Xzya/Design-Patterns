package chainofresponsability;

public class TestCalcChain {

    public static void main(String[] args) {
        IChain chainCalc1 = new AddNumbers();
        IChain chainCalc2 = new SubtractNumbers();
        IChain chainCalc3 = new MultiplyNumbers();
        IChain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "add");
        chainCalc1.calculate(request);

        request = new Numbers(16, 12, "sub");
        chainCalc1.calculate(request);

        request = new Numbers(9, 4, "mult");
        chainCalc1.calculate(request);

        request = new Numbers(4, 2, "div");
        chainCalc1.calculate(request);

        request = new Numbers(4, 2, "pow");
        chainCalc1.calculate(request);

    }
}
