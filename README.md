# Observer - Implementation 1

We implement the observer pattern as follows:
 * The [Stock](src/csc301/observerExample/Stock.java) class extends the [Observable](http://docs.oracle.com/javase/7/docs/api/java/util/Observable.html) class.
 * The [Application](src/csc301/observerExample/Application.java) class implements the [Observer](http://docs.oracle.com/javase/7/docs/api/java/util/Observer.html) interface.
 
 
In the main method, we simply add our `Application` instance, as an observer, to the `Stock` instance.    
From that point onwards, every time we set the price of the stock, the `udpate` method of `Application` gets called.
