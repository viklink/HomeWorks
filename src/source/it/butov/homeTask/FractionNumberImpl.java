package source.it.butov.homeTask;

import java.util.ArrayList;

public class FractionNumberImpl implements FractionNumber{
	
	private int divident;
	private int divisor;
	
	public FractionNumberImpl(int divident, int divisor) {
		this.divident = divident;
		this.divisor = divisor;
	}

	@Override
	public int getDivident() {
		
		return divident;
	}

	@Override
	public int getDivisor() {
		
		return divisor;
	}

	@Override
	public void setDivident(int divident) {
		
		this.divident = divident;
	}

	@Override
	public void setDivisor(int divisor) {
		
		if (divisor == 0) {
			System.out.println("Делитель не может равняться нулю");
		} else {
			this.divisor = divisor;
		}
	}
	@Override
	public String toString() {
		
		return divident + "/" + divisor;
	}
	
	@Override
	public double value() {
		
		return divident / divisor;
	}
	
}
