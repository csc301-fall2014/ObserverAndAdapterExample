package csc301.observerExample;

public class StockObserverAdapter implements StockObserver {

	Stock lastSeen;
	StockObserver2 observer;
	
	public StockObserverAdapter(StockObserver2 observer, Stock initialValue) {
		this.observer = observer;
		updateLastSeen(initialValue); 
	}
	
	
	@Override
	public void onUpdate(Stock stock) {
		observer.onUpdate(lastSeen, stock);
		updateLastSeen(stock);
	}
	
	private void updateLastSeen(Stock stock){
		lastSeen = new Stock(stock.getId(), stock.getPrice());
	}

}
