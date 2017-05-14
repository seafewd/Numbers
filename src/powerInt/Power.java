package powerInt;

/**
 *
 *
 */
public class Power {

public static int pow(int b, int n) {
		
		if (b == 0 && n == 0) { throw new IllegalArgumentException("0^0 is undefined!"); }
		if (n < 0) { throw new IllegalArgumentException("Illegal Power Argument!"); }
		if (n == 0) { return 1; }
		if (n == 1) { return b; }
		return (b * pow(b, n - 1));
		
	}

	public static void main(String[] args) {
		
		System.out.println("3^3 = " + pow(3, 3));
	}
}
