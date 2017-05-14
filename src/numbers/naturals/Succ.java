package numbers.naturals;

public final class Succ extends NaturalNumber {

	private NaturalNumber predecessor;
	
	public Succ(final NaturalNumber n) {
		predecessor = n;
	}
	
	@Override
	public final boolean isZero() {
		return false;
	}

	@Override
	public final boolean isOne() {
		return predecessor == getZero();
	}

	@Override
	public final NaturalNumber getPred() {
		return predecessor;
	}

	@Override
	public final int getDeci() {
		return 1 + predecessor.getDeci();
	}

}
