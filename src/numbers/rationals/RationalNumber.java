package numbers.rationals;

import numbers.naturals.*;
import numbers.integers.*;
import algebra.Field;
import order.LinearOrdering;
import order.DiscreteOrdering;
import order.StrictLinearOrdering;

public class RationalNumber implements Field<RationalNumber>, LinearOrdering<RationalNumber>, 
							DiscreteOrdering<RationalNumber>, StrictLinearOrdering <RationalNumber> {

	private IntegerNumber num, den;
	public final IntegerNumber getNum() {
		return num;
	}
	public final IntegerNumber getDen() {
		return den;
	}
	
	public RationalNumber (final IntegerNumber num, final IntegerNumber den) {
		if (den.isZero()) throw new IllegalArgumentException("The denominator must not be zero!");
		else {
			this.num = num;
			this.den = den;
		}
	}
	
	public static final RationalNumber ZERO = new RationalNumber(IntegerNumber.ZERO, IntegerNumber.ONE); 
	
	public static final RationalNumber ONE = new RationalNumber(IntegerNumber.ONE, IntegerNumber.ONE);
	
	@Override
	public final RationalNumber getZero() {
		return ZERO;
	}
		
	@Override
	public final RationalNumber getOne() {
		return ONE;
	}
	
	@Override
	public final RationalNumber getAddInv() {
		return new RationalNumber(getNum().getAddInv(), getDen());
	}

	@Override
	public final RationalNumber getMultInv() {
		if (getNum().isZero()) throw new ArithmeticException("Zero has no inverse!");
		else 
			return new RationalNumber(getDen(), getNum());
	}
	
	 public final boolean isPos() {
		 return getNum().isPos() && getDen().isPos();
	 }
	 
	 public final boolean isNeg() {
		 return !isPos();
	 }
	
	@Override
	public final RationalNumber plus(final RationalNumber r) {
		return new RationalNumber((getNum().times(r.getDen())).plus(getDen().times(r.getNum())), getDen().times(r.getDen()));
	}
	
	public final RationalNumber minus(final RationalNumber r) {
		return plus(r.getAddInv());
	}
	
	@Override
	public final RationalNumber times(RationalNumber r) {
		return new RationalNumber(getNum().times(r.getNum()), getDen().times(r.getDen()));
	}
	
	 public final RationalNumber dividedby(final RationalNumber r) {
		 return times(r.getMultInv());
	 }
	
	@Override
	public final boolean leq(LinearOrdering<RationalNumber> r) {
		if (isNeg() && ((RationalNumber)r).isPos()) return true;
		if (isPos() && ((RationalNumber)r).isNeg()) return false;
		if (isPos() && ((RationalNumber)r).isPos()) 
			return getNum().times(((RationalNumber)r).getDen()).leq(getDen().times(((RationalNumber)r).getNum()));
		if (isNeg() && ((RationalNumber)r).isNeg()) 
			return getNum().times(((RationalNumber)r).getDen()).geq(getDen().times(((RationalNumber)r).getNum())); 
		return false;
	}

	public final float getDeci() {
		return ((float)getNum().getDeci()) / ((float)getDen().getDeci());
	}
	
	public final RationalNumber power(final NaturalNumber p) throws IllegalArgumentException {
		if (getNum().isZero() && p.isZero()) throw new IllegalArgumentException("0^0 is undefined");
		if (p.isZero()) return getOne();
		if (p.isOne()) return this;
		return times(power(p.getPred()));
	}
	
}
