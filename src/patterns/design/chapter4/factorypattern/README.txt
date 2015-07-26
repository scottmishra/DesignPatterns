Chapter 4: The Factory Pattern

The Factory Method PAttern: Defines an interface for creating an object but
lets the subclasses decide which class to instantiate. Factory MEthod
lets a class defer instantiation to subclasses

All factory patterns encapsulate object creation. The Factory
Method Pattern encapsulate object creation by letting subclasses decide what
object to create.

Generally:
You have a creator class that defines an abstract factory method
that the subclasses implement to produce products, and product classes
which produce concrete classes by implementing the creator method

This can also be done in a parallel class hierarchy instead of a 
top-down hierarchy