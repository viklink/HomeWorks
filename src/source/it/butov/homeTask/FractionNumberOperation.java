package source.it.butov.homeTask;

/**
 * Интерфейс операций с числами FractionNumber.
 * Для вывода ошибок функции могут бросать {@code ArithmeticException}
 */
public interface FractionNumberOperation {

	/**
	 * Сложение двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber add(FractionNumber a, FractionNumber b);
	
	/**
	 * Деление двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber div(FractionNumber a, FractionNumber b);
	
	/**
	 * Умножение двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber mul(FractionNumber a, FractionNumber b);
	
	/**
	 * Вычитание двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber sub(FractionNumber a, FractionNumber b);
}
