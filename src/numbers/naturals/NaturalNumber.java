package numbers.naturals;

import algebra.*;
import order.*;

public abstract class NaturalNumber 
	implements AdditiveMonoid<NaturalNumber>, MultiplicativeMonoid<NaturalNumber>, 
				LinearOrdering<NaturalNumber>, DiscreteOrdering<NaturalNumber>, 
				StrictLinearOrdering<NaturalNumber> {

	public static final NaturalNumber ZERO = new Zero();
	public static final NaturalNumber ONE = new Succ(ZERO);
	
	public final NaturalNumber getZero(){
		return ZERO;
	}
	
	public final NaturalNumber getOne(){
		return ONE;
	}
	
	public abstract boolean isZero();
	public abstract boolean isOne();
	public abstract NaturalNumber getPred();
	public abstract int getDeci();
	
	public final NaturalNumber plus(final NaturalNumber n) {
		if (n.isZero()) return this;
		return (new Succ(this)).plus(n.getPred());
	}
	
	public final NaturalNumber times(final NaturalNumber n) {
		if (isZero() || n.isZero()) return getZero();
		return plus(times(n.getPred()));
	}
	
	public final boolean leq(final LinearOrdering<NaturalNumber> n) {
		if (isZero()) return true;
		if (((NaturalNumber)n).isZero()) return false;
		return getPred().leq(((NaturalNumber)n).getPred());
	}

	public final NaturalNumber power(final NaturalNumber p) throws IllegalArgumentException {
		if (isZero() && p.isZero()) throw new IllegalArgumentException("0^0 is undefined");
		if (p.isZero()) return getOne();
		if (p.isOne()) return this;
		return times(power(p.getPred()));
	}
	
}
