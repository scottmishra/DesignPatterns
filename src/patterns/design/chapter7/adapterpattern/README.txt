Chapter 7: The Adapter Pattern

The Adapter Pattern: Converts the interface od a class into another interface the clients expect. Adapters let
calsses work together that couldn't otherwise because of incompatible interfaces

OO adapters take an interface and adapt it to one that a client is expecting,
without having to change the client or base code. We will simply be wrapping the
interface in order for it to interact with the client.

Using the adapter pattern:
-The client makes a request to the adapter by calling a method on it using the target interface
-The adapter translates the request into one or more calls on the adaptee using the adaptee interface
-The client receives the results of the call and never knows there is an adapter doing the translation

Creating an adapter is directly proportional to the size of the desired interface to adapt to, but
it cleanly encapsulates the all the necessary interface changes

You can use the adapter class to wrap multiple interfaces to reach a target interface

Two-way adapters are possible to support new and old versions of a target interface that your code
still supports

NOTE: There are TWO types of adapters, class and object adapters.  Class adapters need multiple inheritance, which
doesn't exist in java, but does in several other languages. In the class adapter pattern, the adapter class is a
subclass of both the target and adaptee classes.


