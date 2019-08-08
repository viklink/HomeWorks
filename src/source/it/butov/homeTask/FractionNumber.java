package source.it.butov.homeTask;

public interface FractionNumber {

	public static int DEFAULT_DIVISOR_VALUE = 1;

	int getDivident();

	int getDivisor();

	void setDivident(int divident);

	void setDivisor(int divisor);

	String toString();

	double value();

}
