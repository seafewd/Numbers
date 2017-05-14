package algebra;

public interface CommutativeRing<T> extends AdditiveGroup<T>, MultiplicativeMonoid<T> {

	// multiplication must distribute over addition:
	// a*(b+c) = (a*b)+(a*c)
	
}
