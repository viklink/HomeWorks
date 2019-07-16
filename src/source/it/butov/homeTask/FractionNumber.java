package source.it.butov.homeTask;

public interface FractionNumber {
	
	public static int DEFAULT_DIVISOR_VALUE = 1;
	
	/**
	 * Получить делимое
	 */
	int getDivident();
	
	/**
	 * Получить делитель
	 */
	int getDivisor();
	
	/**
	 * Установить делимое
	 */
	void setDivident(int divident);
	
	/**
	 * Установить делитель
	 * @param divisor делитель
	 * @throws IllegalArgumentException если пытаются установить делитель равый 0
	 */
	void setDivisor(int divisor);
	
	/**
	 * Получить символьное представление числа.
	 * 
	 * Например:
     * <blockquote><pre>
     * Если делимое = 1, делитель = 4,
     * то символьное представление числа - 1/4
     * </pre></blockquote>
	 */
	String toString();
	
	/**
	 * Получить значение как вещественное число
	 */
	double value();

}

