package csc301.observerExample;

public class StockObserverAdapter implements StockObserver {

	Stock lastSeen;
	StockObserver2 observer;
	
	public StockObserverAdapter(StockObserver2 observer){
		this.observer = observer;
	}
	
	
	@Override
	public void onUpdate(Stock stock) {
		observer.onUpdate(lastSeen, stock);
		lastSeen = new Stock(stock.getId(), stock.getPrice());
	}
	

}
