package order;

public interface StrictLinearOrdering<T> extends DiscreteOrdering<T> {

	default boolean le(StrictLinearOrdering<T> b) {
		return (this.leq(b) && !this.eq(b));
	}
	
	default boolean gr(StrictLinearOrdering<T> b) {
		return b.le(this);
	}
}
