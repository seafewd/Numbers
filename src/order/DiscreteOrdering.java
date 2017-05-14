package order;

public interface DiscreteOrdering<T> extends LinearOrdering<T> {

	default boolean eq(DiscreteOrdering<T> b) {
		 // exploiting anti-symmetry
		return (this.leq(b) && this.geq(b));
	}
}
