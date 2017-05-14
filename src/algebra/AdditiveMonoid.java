package algebra;

public interface AdditiveMonoid<T> {
	// a mathematical structure with
	// an operation '+' ("plus") that is
	//commutative (a + b =  b + a) and
	// associative (a + (b + c) = (a + b) + c). and
	// has a neutral element '0' ("zero") (a + 0 = a)
	//
	abstract T plus(T b);
	abstract T getZero();
	
}
