package order;

public interface LinearOrdering<T> {

	// a binary relation R that is
	// reflexive: a R a
	// transitive: (a R b AND b R c) => a R c
	// anti-symmetric: (a R b AND b R a) => a=b
	// connected: a R b OR b R a
	
	abstract boolean leq(LinearOrdering<T> b);
	default boolean geq(LinearOrdering<T> b){
		return b.leq(this);
	}
	
}
