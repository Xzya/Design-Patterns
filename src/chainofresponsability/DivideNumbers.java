package chainofresponsability;

public class DivideNumbers implements IChain {

    private IChain nextInChain;

    @Override
    public void setNextChain(IChain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "div") {
            System.out.println(request.getNumber1() + " / " + request.getNumber2() +
                    " = " + (request.getNumber1() / request.getNumber2()));
        } else {
            System.out.println("Action not found.");
        }
    }

}
