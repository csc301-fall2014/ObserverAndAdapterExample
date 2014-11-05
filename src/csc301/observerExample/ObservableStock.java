package csc301.observerExample;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ObservableStock extends Stock {

	private Set<StockObserver> observers;
	
	public ObservableStock(String id, BigDecimal price) {
		super(id, price);
		observers = new HashSet<StockObserver>();
	}

	
	@Override
	public void setPrice(BigDecimal price) {
		super.setPrice(price);
		
		if(observers == null){
			return;
		}
		for(StockObserver observer : observers){
			observer.onUpdate(this);
		}
	}
	
	
	public void addObserver(StockObserver o){
		if(o == null){
			throw new IllegalArgumentException("Cannot add null as an observer.");
		}
		observers.add(o);
	}
	
	
	public void removeObserver(StockObserver o){
		observers.remove(o);
	}
}
