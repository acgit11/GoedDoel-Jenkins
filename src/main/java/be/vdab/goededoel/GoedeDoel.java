package be.vdab.goededoel;

import java.math.BigDecimal;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GoedeDoel goedeDoel)) return false;
		return naam.equals(goedeDoel.naam);
	}

	@Override
	public int hashCode() {
		return naam.hashCode();
	}

}
