Chapter 7: The Facade Pattern


The Facade Pattern: provides a unified interface to a set of interfaces in a subsystem. Facade defines a 
higher-level interface that makes the subsystem easier to use

The Facade pattern is ment to make an interface simpler to use

The facade pattern is nice as it allows the client code to be designed to reference and use
the facade interface which hides a complex set of subclasses and interfaces behind an "easy" to use
interface. This decouples the clients from the base subclasses, and allows for easy plug and play
of new base classes and interfaces