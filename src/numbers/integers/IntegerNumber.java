package numbers.integers;

import numbers.naturals.*;
import algebra.CommutativeRing;
import order.DiscreteOrdering;
import order.LinearOrdering;
import order.StrictLinearOrdering;

public final class IntegerNumber
		implements CommutativeRing<IntegerNumber>, LinearOrdering<IntegerNumber>, 
		StrictLinearOrdering<IntegerNumber>, DiscreteOrdering<IntegerNumber> {

	private NaturalNumber abs;
	public final NaturalNumber getAbs() {
		return abs;
	}
	
	private Sign sign;
	public final Sign getSign(){
		return sign;
	}
		
	public IntegerNumber (final Sign sign, final NaturalNumber abs) {
		 this.abs = abs;
		 this.sign = sign;
	}
	
	public static final IntegerNumber ZERO = new IntegerNumber(Sign.plus, NaturalNumber.ZERO); 
	public static final IntegerNumber ONE = new IntegerNumber(Sign.plus, NaturalNumber.ONE);
				
	public final IntegerNumber getZero() {
		return ZERO;
	}
		
	public final IntegerNumber getOne() {
		return ONE;
	}
		
	public final IntegerNumber getAddInv() {
		if (isZero()) return this;
		if (isPos()) return new IntegerNumber(Sign.minus, getAbs());
		return new IntegerNumber(Sign.plus, getAbs());
	}
		
	public final boolean isZero() {
		return getAbs().isZero();
	}
	
	public final boolean isOne(){
		return (getAbs().isOne() && sign == Sign.plus);
	}
	
	public final boolean isPos(){
		return (isZero() || sign == Sign.plus);
	}
	
	public final boolean isNeg() {
		return !isPos();
	}
	
	public final IntegerNumber plus(final IntegerNumber i) {  
		if (isPos() && i.isPos()) 
			return new IntegerNumber(Sign.plus, getAbs().plus(i.getAbs()));
		if (isNeg() && i.isNeg()) 
			return new IntegerNumber(Sign.minus, getAbs().plus(i.getAbs()));
		if (isPos() && i.isNeg())	
			if (isZero()) return i;
			else 
				return (new IntegerNumber(Sign.plus, getAbs().getPred())).plus(new IntegerNumber(Sign.minus, i.getAbs().getPred()));
		if (isNeg() && i.isPos())
			if (i.isZero()) return this;
			else 
				return (new IntegerNumber(Sign.minus, getAbs().getPred())).plus(new IntegerNumber(Sign.plus, i.getAbs().getPred()));
		return null;
	}
	
	public final IntegerNumber minus (final IntegerNumber i) {
		return plus(i.getAddInv());
	}
		
	public final IntegerNumber times(final IntegerNumber i) {
		if (isZero() || i.isZero()) return getZero();
		if (isPos() && i.isPos() || isNeg() && i.isNeg())  
			return new IntegerNumber(Sign.plus, getAbs().times(i.getAbs()));
		return new IntegerNumber(Sign.minus, getAbs().times(i.getAbs()));
	}
			
	public final boolean leq(final LinearOrdering<IntegerNumber> i) {
		if (isNeg() && ((IntegerNumber)i).isPos()) return true;
		if (isPos() && ((IntegerNumber)i).isNeg()) return false;
		if (isPos() && ((IntegerNumber)i).isPos()) return getAbs().leq(((IntegerNumber)i).getAbs());
		return getAbs().geq(((IntegerNumber)i).getAbs());
	}
	
	public final int getDeci() {
		if (isPos()) return getAbs().getDeci();
		return -getAbs().getDeci();
	}
	
	public final IntegerNumber power(final NaturalNumber p) throws IllegalArgumentException {
		if (isZero() && p.isZero()) throw new IllegalArgumentException("0^0 is undefined");
		if (p.isZero()) return getOne();
		if (p.isOne()) return this;
		return times(power(p.getPred()));
	}
	
}
