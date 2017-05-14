import numbers.integers.IntegerNumber;
import numbers.integers.Sign;
import numbers.naturals.NaturalNumber;
import numbers.naturals.Succ;
import numbers.naturals.Zero;
import numbers.rationals.RationalNumber;

public class NumberTest {

	private static final NaturalNumber N_ZER = new Zero();
	private static final NaturalNumber N_ONE = new Succ(N_ZER);
	private static final NaturalNumber N_TWO = new Succ(N_ONE);
	private static final NaturalNumber N_THREE = new Succ(N_TWO);
	private static final NaturalNumber N_FOUR = new Succ(N_THREE);

	private static final IntegerNumber Z_ZER = new IntegerNumber(Sign.plus, N_ZER);
	private static final IntegerNumber Z_ONE = new IntegerNumber(Sign.plus, N_ONE);
	private static final IntegerNumber Z_TWO = new IntegerNumber(Sign.plus, N_TWO);
	private static final IntegerNumber Z_M_ONE = Z_ONE.getAddInv();
	private static final IntegerNumber Z_M_TWO = Z_TWO.getAddInv();

	private static final RationalNumber Q_ZER = new RationalNumber(Z_ZER, Z_ONE);
	private static final RationalNumber Q_ONE = new RationalNumber(Z_ONE, Z_ONE);
	private static final RationalNumber Q_TWO = new RationalNumber(Z_TWO, Z_ONE);
	private static final RationalNumber Q_M_ONE = Q_ONE.getAddInv();
	private static final RationalNumber Q_M_TWO = Q_TWO.getAddInv();
	private static final RationalNumber Q_HALF = Q_TWO.getMultInv();

	public static void main(String[] args) {

		// System.out.print(N_ZER.getDeci()+"\n");
		// System.out.print(N_ONE.getDeci()+"\n");
		// System.out.print(N_TWO.getDeci()+"\n");
		// System.out.print(Z_ZER.getDeci()+"\n");
		// System.out.print(Z_ONE.getDeci()+"\n");
		// System.out.print(Z_TWO.getDeci()+"\n");
		// System.out.print(Z_M_ONE.getDeci()+"\n");
		// System.out.print(Z_M_TWO.getDeci()+"\n");
		// System.out.print(Q_ZER.getDeci()+"\n");
		// System.out.print(Q_ONE.getDeci()+"\n");
		// System.out.print(Q_TWO.getDeci()+"\n");
		// System.out.print(Q_M_ONE.getDeci()+"\n");
		// System.out.print(Q_M_TWO.getDeci()+"\n");
		// System.out.print(Q_HALF.getDeci()+"\n\n");
		//
		// NaturalNumber plusN = N_ZER.plus(N_ONE, N_TWO);
		// System.out.println("Natural Plus");
		// System.out.println("----------------");
		// System.out.println("1 + 2 = " + plusN.getDeci() + "\n");
		//
		// NaturalNumber timesN = N_ZER.times(N_TWO, N_TWO);
		// System.out.println("Natural Times");
		// System.out.println("----------------");
		// System.out.println("2 * 2 = " + timesN.getDeci() + "\n");
		//
		// System.out.println(N_ZER.leq(N_ONE, N_TWO));
		//
		//
		//
		// IntegerNumber plusI = Z_ZER.plus(Z_ONE, Z_M_TWO);
		// System.out.println("Integer Plus");
		// System.out.println("----------------");
		// System.out.println("1 + (-2) = " + plusI.getDeci() + "\n");
		//
		// IntegerNumber plusIn = Z_ZER.plus(Z_M_TWO, Z_ONE);
		// System.out.println("Integer Plus");
		// System.out.println("----------------");
		// System.out.println("(-2) + 1 = " + plusIn.getDeci() + "\n");
		//
		// IntegerNumber minusI = Z_ZER.minus(Z_M_TWO, Z_M_ONE);
		// System.out.println("Integer Minus");
		// System.out.println("----------------");
		// System.out.println("(-2) - (-1): " + minusI.getDeci() + "\n");
		//
		// IntegerNumber timesI = Z_ZER.times(Z_TWO, Z_TWO);
		// System.out.println("Integer Times");
		// System.out.println("----------------");
		// System.out.println("2 * 2 = " + timesI.getDeci() + "\n");
		//
		// RationalNumber plus = Q_ZER.plus(Q_ONE, Q_TWO);
		// System.out.println("Rational Plus");
		// System.out.println("----------------");
		// System.out.println("1/1 + 2/1 = " + plus.getDeci() + "\n");
		//
		// RationalNumber minus = Q_ZER.minus(Q_M_ONE, Q_TWO);
		// System.out.println("Rational Minus");
		// System.out.println("----------------");
		// System.out.println("(-1/1) - 2/1 = " + minus.getDeci() + "\n");
		//
		// RationalNumber times = Q_ZER.times(Q_ONE, Q_TWO);
		// System.out.println("Rational Times");
		// System.out.println("----------------");
		// System.out.println("1/1 * 2/1 = " + times.getDeci() + "\n");
		//
		// RationalNumber divide = Q_ZER.dividedby(Q_ONE, Q_TWO);
		// System.out.println("Rational Divide");
		// System.out.println("----------------");
		// System.out.println("1/1 / 2/1 = " + divide.getDeci() + "\n");
		//
		// System.out.println("LowEqual Rational 2/1 und 1/1");
		// System.out.println("----------------");
		// System.out.println(Q_ZER.leq(Q_TWO, Q_ONE));

		// RationalNumber[] vektorArray = { Q_TWO, Q_ONE, Q_TWO };
		// RationalNumber skalarProdukt = Q_ZER.scalarMultiplication(Q_ONE,
		// vektorArray);
		// System.out.println("SkalarProdukt");
		// System.out.println("----------------");
		// System.out.println(skalarProdukt.getDeci() + "\n");

		// System.out.println("Final exam: Power as Iterative");
		// System.out.println("----------------");
		// System.out.println(N_ZER.pow(2, 4) + "\n");

		// System.out.println("Final exam: Factorial as Iterative");
		// System.out.println("----------------");
		// System.out.println(N_ZER.factorial(5));

		// NaturalNumber Uebung2 = N_ONE.calculate(N_FOUR, N_TWO);
		// System.out.println(Uebung2.getDeci());

		NaturalNumber naturalPower = N_ZER.power(N_TWO, N_ONE);
		System.out.println("Natural Power");
		System.out.println("----------------");
		System.out.println("2^1 = " + naturalPower.getDeci() + "\n");

		IntegerNumber integerPower = Z_ZER.power(Z_TWO, N_TWO);
		System.out.println("Integer Power");
		System.out.println("----------------");
		System.out.println("2^2 = " + integerPower.getDeci() + "\n");

		RationalNumber rationalPower = Q_ZER.power(new RationalNumber(Z_ONE, Z_ONE), N_TWO);
		System.out.println("Rational Power");
		System.out.println("----------------");
		System.out.println("(1/1)^2 = " + rationalPower.getDeci() + "\n");
	}
}