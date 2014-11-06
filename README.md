# Observer - Implementation 2

We implement the observer pattern as follows:
 * [Stock](src/csc301/observerExample/Stock.java) doesn't extend any class (i.e. it extends `Object`).
 * We created an [ObservableStock](src/csc301/observerExample/ObservableStock.java) class, that extends `Stock`.     
   As the name suggests, `ObservableStock` extends `Stock` with observable functionality.
 * We define our own [StockObserver](src/csc301/observerExample/StockObserver.java) interface.
 * [Application](src/csc301/observerExample/Application.java) implements our `StockObserver` interface.
 
 
In the main method, we simply add our `Application` instance, as an observer, to the `ObservableStock` instance.    
From that point onwards, every time we set the price of the stock, the `onUdpate` method of `Application` gets called.
