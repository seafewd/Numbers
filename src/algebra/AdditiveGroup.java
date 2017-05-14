package algebra;

public interface AdditiveGroup<T> extends AdditiveMonoid<T> {

	// an additive monoid with inverse elements: a + (-a) = 0
	
	abstract T getAddInv();
	
}
