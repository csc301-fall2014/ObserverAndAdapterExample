# The Bad Example

This solution is very bad in terms of software design - Our [Stock](src/csc301/observerExample/Stock.java) class 
(which is essentially just a <`id`,`price`> pair) depends on some arbitrary application.
 * We cannot use our Stock class without the [Application](src/csc301/observerExample/Application.java) class.
 * If a different application will need to take an action every time a stock changes, then we'll need to change the code.
 
# The Solution - Observer pattern

The _observer_ pattern actually involves two components - An observer and an observable.

 * An Observer is a component that can respond to changes.
 * An Observable is a component that
   * Allows you to add/remove observers.
   * Notifies the observers whenever something changes.

The observable doesn't need to know about the specific implementation of its observers.
As long as the observers know how to respond to changes (i.e. They implement some interface), the observable can do its job.

There are two ways to implement this pattern in Java:
 * [Implementation 1](https://github.com/csc301-fall2014/ObserverAndAdapterExample/tree/observer-impl1)
 * [Implementation 2](https://github.com/csc301-fall2014/ObserverAndAdapterExample/tree/observer-impl2)
 

