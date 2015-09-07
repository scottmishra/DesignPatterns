Chapter 8: The Template Method Pattern

The Template Method: defines the skeleton of an alogrithm un a method, deferring some steps to subclasses.
Template method lets subclasses redefine certain steps of an algorithm wihtout changing the structures

The template method pattern -> defines steps of algorithm and allows subclasses to 
provide the implementation for one or more of the steps. This helps consolidate all the
duplicate code across several implementations of an algorithm, while still allowing the flexibilty 
to change any component of it.

Hooks: A hook is a method that is declared in the abstract class, but only gives an empty or default behavior. This 
is useful for allowing subclasses to jump into a part of an algorithm if they want to, or they can skip all together