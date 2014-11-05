package csc301.observerExample;

import java.math.BigDecimal;

public class Stock {

	
	private String id;
	private BigDecimal price;
	
	/*
	 * A note about BigDecimal.
	 * 
	 * During exercise 1, some of you noticed that using double to save
	 * currency values (limited to 2 decimal places), can lead to some
	 * unexpected behaviour.
	 * 
	 * This is related to the way that doubles are stored in memory (64 bits,
	 * interpreted as a binary number according to some IEEE standard) - Some numbers
	 * cannot be represented accurately in binary, so we have some small error.
	 * As we perform arithmetic operations (especially multiplication/division) these
	 * errors propagate, and become more significant.
	 * 
	 * BigDecimal is a more suitable Java type for currency values.
	 */
	
	
	public Stock(String id, BigDecimal price) {
		if(id == null || id.trim().length() == 0){
			throw new IllegalArgumentException("Empty/null identifiers not allowed.");
		}
		this.id = id;
		setPrice(price);
	}

	
	
	public String getId() {
		return id;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	
	public void setPrice(BigDecimal price) {
		if(price.signum() < 0){
			throw new IllegalArgumentException("Price must be non-negative.");
		}
		this.price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	
	@Override
	public String toString() {
		return String.format("<%s, %s>", this.id, this.price.toString());
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Stock && ((Stock)o).getId().equals(this.id) &&
				((Stock)o).getPrice().compareTo(this.price) == 0;
	}
	
	
}
