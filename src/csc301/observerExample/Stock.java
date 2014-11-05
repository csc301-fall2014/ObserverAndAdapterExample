package csc301.observerExample;

import java.math.BigDecimal;

public class Stock {

	
	private String id;
	private BigDecimal price;
	private Application application; 
	
	
	public Stock(String id, BigDecimal price, Application application) {
		if(id == null || id.trim().length() == 0){
			throw new IllegalArgumentException("Empty/null identifiers not allowed.");
		}
		this.id = id;
		this.application = application;
		setPrice(price);
	}

	
	public Stock(String id, BigDecimal price){
		this(id, price, null);
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
		
		if(application != null){
			application.stockPriceUpdated(this);
		}
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
