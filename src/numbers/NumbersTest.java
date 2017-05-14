package numbers;

import numbers.integers.*;
import numbers.naturals.*;
import numbers.rationals.*;

public class NumbersTest {

	private static NaturalNumber[] n_arr = new NaturalNumber[6];
	private static IntegerNumber[] z_arr = new IntegerNumber[n_arr.length*2-1];
	private static RationalNumber[] q_arr = new RationalNumber[z_arr.length];
		
	public static void main(String[] args) throws Exception {
				
		new NaturalTest(n_arr);
		System.out.println("***********************************************************");
		new IntegerTest(z_arr, n_arr);
		System.out.println("***********************************************************");
		new RationalTest(q_arr, z_arr, n_arr);
		
	}

}
