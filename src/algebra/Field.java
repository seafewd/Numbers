package algebra;

public interface Field<T> extends AdditiveGroup<T>, MultiplicativeGroup<T> {
	
	// a combination of
	// an additive and a multiplicative group so that
	// their neutral elements are different
	// not (0 = 1)
	// multiplication distributes over addition
	// a*(b+c) = (a*b)+(a*c)
	
	abstract T getMultInv() throws ArithmeticException;  // division by 0!
}
