package source.it.butov.homeTask;

public class FractionNumberOperationImpl implements FractionNumberOperation{
	
	int divident;
    int divisor;
    
    public FractionNumberOperationImpl (int divident, int divisor) {
        this.divident = divident;
        this.divisor = divisor;
    }

    private int dividentA;
    private int divisorA;
    private int dividentB;
    private int divisorB;

    FractionNumber a = (FractionNumber) new FractionNumberOperationImpl (dividentA, divisorA);

    FractionNumber b = (FractionNumber) new FractionNumberOperationImpl (dividentB,divisorB);

	@Override
	public FractionNumber add(FractionNumber a, FractionNumber b) {
		
		int dividentC = dividentA * divisorB + dividentB * divisorA; // числитель новой дроби
        int divisorC = divisorA * divisorB; // знаменатель новой дроби

        FractionNumber c = (FractionNumber) new FractionNumberOperationImpl(dividentC, divisorC);

        System.out.println((Integer.toString(dividentA) + "/" + Integer.toString(divisorA)) + " + "
                + (Integer.toString(dividentB) + "/" + Integer.toString(divisorB)) + " = "
                + (Integer.toString(dividentC) + "/" + Integer.toString(divisorC)));

        return  c;
	}

	@Override
	public FractionNumber div(FractionNumber a, FractionNumber b) {
		int dividentC = dividentA * divisorB;
        int divisorC = divisorB * dividentA;

        FractionNumber c = (FractionNumber) new FractionNumberOperationImpl(dividentC, divisorC);

        System.out.println((Integer.toString(dividentA) + "/" + Integer.toString(divisorA)) + " / "
                + (Integer.toString(dividentB) + "/" + Integer.toString(divisorB)) + " = "
                + (Integer.toString(dividentC) + "/" + Integer.toString(divisorC)));

        return c;
	}

	@Override
	public FractionNumber mul(FractionNumber a, FractionNumber b) {
		int dividentC = dividentA * dividentB;
        int divisorC = divisorA * divisorB;

        FractionNumber c = (FractionNumber) new FractionNumberOperationImpl(dividentC, divisorC);

        System.out.println((Integer.toString(dividentA) + "/" + Integer.toString(divisorA)) + " * "
                + (Integer.toString(dividentB) + "/" + Integer.toString(divisorB)) + " = "
                + (Integer.toString(dividentC) + "/" + Integer.toString(divisorC)));
        return c;
	}

	@Override
	public FractionNumber sub(FractionNumber a, FractionNumber b) {
		int dividentC = dividentA * divisorB - dividentB * divisorA;
        int divisorC = divisorA * divisorB;

        FractionNumber c = (FractionNumber) new FractionNumberOperationImpl(dividentC, divisorC);

        System.out.println((Integer.toString(dividentA) + "/" + Integer.toString(divisorA)) + " - "
                + (Integer.toString(dividentB) + "/" + Integer.toString(divisorB)) + " = "
                + (Integer.toString(dividentC) + "/" + Integer.toString(divisorC)));
        return c;
	}

}
