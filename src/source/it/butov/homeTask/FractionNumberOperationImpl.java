package source.it.butov.homeTask;

public class FractionNumberOperationImpl implements FractionNumberOperation{
	
    public FractionNumberOperationImpl () {

    }

    private int dividentA;
    private int divisorA;
    private int dividentB;
    private int divisorB;

    FractionNumber a =  new FractionNumberImpl (dividentA, divisorA);

    FractionNumber b = new FractionNumberImpl (dividentB,divisorB);

	@Override
	public FractionNumber add(FractionNumber a, FractionNumber b) {
		
		int dividentC = a.getDivident() * b.getDivisor() + b.getDivident() + a.getDivisor();
        int divisorC = a.getDivisor() * b.getDivisor();

        FractionNumber c = new FractionNumberImpl(dividentC, divisorC);
        
        return  c;
	}

	@Override
	public FractionNumber div(FractionNumber a, FractionNumber b) {
		int dividentC = a.getDivident() * b.getDivisor();
        int divisorC = b.getDivisor() * a.getDivident();

        FractionNumber c = new FractionNumberImpl(dividentC, divisorC);

        return c;
	}

	@Override
	public FractionNumber mul(FractionNumber a, FractionNumber b) {
		int dividentC = a.getDivident() * b.getDivident();
        int divisorC = a.getDivisor() * b.getDivisor();

       FractionNumber c = new FractionNumberImpl(dividentC, divisorC);

        return c;
	}

	@Override
	public FractionNumber sub(FractionNumber a, FractionNumber b) {
		int dividentC = a.getDivident() * b.getDivisor() - b.getDivident() * a.getDivisor();
        int divisorC = a.getDivisor() * b.getDivisor();

        FractionNumber c = new FractionNumberImpl(dividentC, divisorC);

        return c;
	}

}
