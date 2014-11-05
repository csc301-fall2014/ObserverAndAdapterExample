package csc301.observerExample;

import java.math.BigDecimal;

public class Application {

	
	public void stockPriceUpdated(Stock stock){
		System.out.println("Stock price updated: " + stock);
		System.out.println("Based on the price I can decide if I should buy/sell this stock.");
	}
	
	
	
	public static void main(String[] args) {
		Application application = new Application();
		Stock s = new Stock("AMZN", new BigDecimal("296.52"), application);
		s.setPrice(s.getPrice().multiply(new BigDecimal("1.02")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("0.97")));
	}
}
