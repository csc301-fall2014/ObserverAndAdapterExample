# New Requirements

We introduce a new requirement - When the application code gets notified of a price update, it wants to get the old and new price.

There are many ways to satisfy this requirement, and here is how we did it:
 * We defined the [StockObserver2](src/csc301/observerExample/StockObserver2.java) interface.
 * [Application](src/csc301/observerExample/Application.java) implements `StockObserver2`.
 * Since our [Stock](src/csc301/observerExample/Stock.java) can only add observers of type `StockObserver` (and not `StockObserver2`),
   we created [StockObserverAdapter](src/csc301/observerExample/StockObserverAdapter.java)
 
Our adapter works as follows:
 * It implements the [StockObserver](src/csc301/observerExample/StockObserver.java) interface, and, therefore, can observe `Stock` instances.
 * It also takes a [StockObserver2](src/csc301/observerExample/StockObserver2.java) argument in the constructor, and stores it in an instance variable.
 * Whenever our adapter observes an update in a `Stock`, it calls the `onUpdate` method of its `StockObserver2` member.    
   All the adapter needs to do, in order to do its job, is to remember the most recent price of the stock.
