package csc301.observerExample;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class Application implements Observer {

	
	@Override
	public void update(Observable observable, Object additionalArgument) {
		Stock stock = (Stock) observable;
		System.out.println("Stock price updated: " + stock);
		System.out.println("Based on the price I can decide if I should buy/sell this stock.");
	}
	
	
	
	
	public static void main(String[] args) {
		Application application = new Application();
		
		Stock s = new Stock("AMZN", new BigDecimal("296.52"));
		s.addObserver(application);
		
		
		s.setPrice(s.getPrice().multiply(new BigDecimal("1.02")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("0.97")));
	}

}
