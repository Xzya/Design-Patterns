package chainofresponsability;

/**
 * The Chain-of-responsability pattern has a group of objects
 * that are expected to solve a problem, if the first object
 * can't solve it, it passes the data to the next object in
 * the chain.
 * 
 * @author Mihail Cristian Dumitru
 *
 */

public interface IChain {

    public void setNextChain(IChain nextChain);

    public void calculate(Numbers request);

}
