package numbers;

import numbers.integers.*;
import numbers.naturals.*;
import numbers.rationals.*;

public class RationalTest {

	public RationalTest(RationalNumber[] q_arr, IntegerNumber[] z_arr, NaturalNumber[] n_arr) throws Exception {
		
		//Create an array of rational numbers
		int mid = z_arr.length/2;
		for (int i = q_arr.length-1; i >= 0 ; i--) {
			q_arr[i] = (i == mid) ? RationalNumber.ZERO :
						(i == mid+1) ? RationalNumber.ONE : 
						(i > mid+1) ? new RationalNumber(z_arr[i], z_arr[mid+1]) : q_arr[++mid].getAddInv();
		}
		
		System.out.println("Rational numbers test:");
		for (RationalNumber q : q_arr) System.out.print(q.getDeci() + "  ");
		System.out.println();
		System.out.println("1/2 = " + q_arr[7].getMultInv().getDeci());
		System.out.println(q_arr[0].getDeci() + " is positive - " + q_arr[0].isPos());
		System.out.println(q_arr[0].getDeci() + " is negative - " + q_arr[0].isNeg());
		System.out.println("1/3 + 2/3 = " + q_arr[8].getMultInv().plus(new RationalNumber(z_arr[7], z_arr[8])).getDeci());
		System.out.println("1/3 + 1/2 = " + q_arr[8].getMultInv().plus(q_arr[7].getMultInv()).getDeci());
		System.out.println("1/3 - 1/2 = " + q_arr[8].getMultInv().minus(q_arr[7].getMultInv()).getDeci());
		System.out.println("-2/5 * 5/2 = " + (new RationalNumber(z_arr[7], z_arr[0])).times(new RationalNumber(z_arr[10], z_arr[7])).getDeci());
		System.out.println("-2/5 : 5/2 = " + (new RationalNumber(z_arr[7], z_arr[0])).dividedby(new RationalNumber(z_arr[10], z_arr[7])).getDeci());
		System.out.println("-3/5 : 3/5 = " + (new RationalNumber(z_arr[8], z_arr[0])).dividedby(new RationalNumber(z_arr[8], z_arr[10])).getDeci());
		System.out.println(q_arr[0].getDeci() + " < " + q_arr[10].getDeci() + " - " + q_arr[0].le(q_arr[10]));
		System.out.println(q_arr[0].getDeci() + " >= " + q_arr[10].getDeci() + " - " + q_arr[0].geq(q_arr[10]));
		System.out.println("-5.0^1 = " + (q_arr[0].power(n_arr[1])).getDeci());
		System.out.println("-5.0^2 = " + (q_arr[0].power(n_arr[2])).getDeci());
		System.out.println("-5.0^3 = " + (q_arr[0].power(n_arr[3])).getDeci());
		System.out.println();
	}
}
