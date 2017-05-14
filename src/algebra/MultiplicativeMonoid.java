package algebra;

public interface MultiplicativeMonoid<T> {
	// a mathematical structure with
	// an operation '*' ("times") that is
	//commutative (a * b =  b * a) and
	// associative (a * (b * c) = (a * b) * c). and
	// has a neutral element '1' ("one") (a * 1 = a)
	//
		abstract T times(T b);
		abstract T getOne();
}
