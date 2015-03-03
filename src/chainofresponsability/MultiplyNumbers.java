package chainofresponsability;

public class MultiplyNumbers implements IChain {

    private IChain nextInChain;

    @Override
    public void setNextChain(IChain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "mult") {
            System.out.println(request.getNumber1() + " * " + request.getNumber2() +
                    " = " + (request.getNumber1() * request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }

}
