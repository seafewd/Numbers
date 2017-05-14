package numbers.naturals;

public final class Zero extends NaturalNumber {

	@Override
	public final boolean isZero() {
		return true;
	}

	@Override
	public final boolean isOne() {
		return false;
	}

	@Override
	public final NaturalNumber getPred() {
		return null;  // or throw exception
	}

	@Override
	public final int getDeci() {
		return 0;
	}
	

}
