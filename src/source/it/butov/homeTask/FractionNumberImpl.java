package source.it.butov.homeTask;

import java.util.ArrayList;

public class FractionNumberImpl implements FractionNumber{
	
	int divident;
	int divisor;
	
	ArrayList <Integer> dividents = new ArrayList<>();
	
	ArrayList <Integer> divisors = new ArrayList<>();
	
	public FractionNumberImpl(int divident, int divisor) {
		this.divident = divident;
		this.divisor = divisor;
	}

	@Override
	public int getDivident() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < dividents.size(); i++) {
		int divident = (int)dividents.get(i);
		}
		return divident;
	}

	@Override
	public int getDivisor() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < divisors.size(); i++) {
			int divisor = (int)divisors.get(i);
		}
		
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
	
	public void printNumber(int divident, int divisor) {
		this.divident = divident;
		this.divisor = divisor;
	System.out.println(Integer.toString(divident) + "/" + Integer.toString(divisor));
	}
	
	@Override
	public double value() {
		// TODO Auto-generated method stub
		double value = divident / divisor;
		System.out.println(value);
		return value;
	}
	
	

}
