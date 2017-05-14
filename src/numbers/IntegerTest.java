package numbers;

import numbers.integers.*;
import numbers.naturals.*;

public class IntegerTest {

	public IntegerTest(IntegerNumber[] z_arr, NaturalNumber[] n_arr) throws Exception {
		
		//Create an array of integer numbers
		int mid = z_arr.length/2;
		for (int i = z_arr.length-1; i >= 0 ; i--) {
			z_arr[i] = (i == mid) ? IntegerNumber.ZERO :
						(i == mid+1) ? IntegerNumber.ONE :
						(i > mid+1) ? new IntegerNumber(Sign.plus, n_arr[i-mid]) : z_arr[++mid].getAddInv();
		}
				
		System.out.println("Integer numbers test:");
		for (IntegerNumber z : z_arr) System.out.print(z.getDeci() + "  ");
		System.out.println();
		System.out.println(z_arr[7].getDeci() + " is positiv - " + z_arr[7].isPos());
		System.out.println(z_arr[7].getDeci() + " is negativ - " + z_arr[7].isNeg());
		System.out.println(z_arr[0].getDeci() + " + " + z_arr[1].getDeci() + " = " + z_arr[0].plus(z_arr[1]).getDeci());
		System.out.println(z_arr[1].getDeci() + " + " + z_arr[8].getDeci() + " = " + z_arr[1].plus(z_arr[8]).getDeci());
		System.out.println(z_arr[8].getDeci() + " + " + z_arr[1].getDeci() + " = " + z_arr[8].plus(z_arr[1]).getDeci());
		System.out.println(z_arr[9].getDeci() + " + " + z_arr[3].getDeci() + " = " + z_arr[9].plus(z_arr[3]).getDeci());
		System.out.println(z_arr[10].getDeci() + " - " + z_arr[3].getDeci() + " = " + z_arr[10].minus(z_arr[3]).getDeci());
		System.out.println(z_arr[5].getDeci() + " - " + z_arr[7].getDeci() + " = " + z_arr[5].minus(z_arr[7]).getDeci());
		System.out.println(z_arr[0].getDeci() + " * " + z_arr[8].getDeci() + " = " + z_arr[0].times(z_arr[8]).getDeci());
		System.out.println(z_arr[0].getDeci() + " * " + z_arr[2].getDeci() + " = " + z_arr[0].times(z_arr[2]).getDeci());
		System.out.println(z_arr[1].getDeci() + " < " + z_arr[2].getDeci() + " - " + z_arr[1].le(z_arr[2]));
		System.out.println(z_arr[2].getDeci() + " < " + z_arr[1].getDeci() + " - " + z_arr[2].le(z_arr[1]));
		System.out.println(z_arr[5].getDeci() + " >= " + z_arr[0].getDeci() + " - " + z_arr[5].geq(z_arr[0]));
		System.out.println("-5^1 = " + (z_arr[0].power(n_arr[1])).getDeci());
		System.out.println("-5^2 = " + (z_arr[0].power(n_arr[2])).getDeci());
		System.out.println("-5^3 = " + (z_arr[0].power(n_arr[3])).getDeci());
		System.out.println();
	}
	
}
