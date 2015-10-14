# The Bad Example

We have three components:

 * [Stock](src/csc301/observerExample/Stock.java) - Cotains an id and price.
 * [Application](src/csc301/observerExample/Application.java) - Represents an arbitrary application in a real system
 * [Main](src/csc301/observerExample/Main.java) - A simple script that "drives the code".

This solution is very bad in terms of software design - Our `Stock` class depends on some arbitrary application.
 * We cannot use `Stock` without the `Application` class.
 * If a different application needs to get notified stock changes, then we'll need to change the `Stock` class again.
 
# The Solution - Observer pattern

The _observer_ pattern involves two components:

 * Observer - Observes another component, an observable, for changes
 * Observable - Notifies its observer(s) whenever something changes.

There are two common ways to implement this pattern in Java:
 * [Implementation 1](https://github.com/csc301-fall2014/ObserverAndAdapterExample/tree/observer-impl1)
 * [Implementation 2](https://github.com/csc301-fall2014/ObserverAndAdapterExample/tree/observer-impl2)
 

