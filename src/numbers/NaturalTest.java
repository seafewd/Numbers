package numbers;

import numbers.naturals.*;

public class NaturalTest {

	
	public NaturalTest(NaturalNumber[] n_arr) throws IllegalArgumentException{		
		
		// Create an array of natural numbers
		n_arr[0] = NaturalNumber.ZERO;
		n_arr[1] = NaturalNumber.ONE;
		for (int i = 2; i < n_arr.length; i++) {
			n_arr[i] = new Succ(n_arr[i-1]);
		}
			
		System.out.println("Natural numbers test:");
		for (NaturalNumber n : n_arr) System.out.print(n.getDeci() + "  ");
		System.out.println();
		System.out.println("1 + 0 = " + n_arr[1].plus(n_arr[0]).getDeci());
		System.out.println("5 + 3 = " + n_arr[5].plus(n_arr[3]).getDeci());
		System.out.println("4 * 3 = " + n_arr[4].times(n_arr[3]).getDeci());
		System.out.println("0 * 5 = " + n_arr[0].times(n_arr[5]).getDeci());
		System.out.println("0 <= 5 - " + n_arr[0].leq(n_arr[5]));
		System.out.println("5 < 0 - " + n_arr[5].le(n_arr[0]));
		System.out.println("0 >= 5 - " + n_arr[0].geq(n_arr[5]));
		System.out.println("1. number is 0 - " + n_arr[0].isZero());
		System.out.println("5^0 = " + n_arr[5].power(n_arr[0]).getDeci());
		System.out.println("5^1 = " + n_arr[5].power(n_arr[1]).getDeci());
		System.out.println("5^2 = " + n_arr[5].power(n_arr[2]).getDeci());
		System.out.println("5^3 = " + n_arr[5].power(n_arr[3]).getDeci());
		System.out.println();
	}
	
}
