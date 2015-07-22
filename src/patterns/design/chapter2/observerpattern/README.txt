Chapter 2: The Observer Pattern

Defines a one-to-many dependency between objects
so that when one object changes state, all of its
dependents are notified and updated automatically

Loose Coupling:
When two objects are loosely coupled, they can interact,
but have very little knowledge of each other. 
	-The only thing the subject knows about an observer
	it that it implements a certain interface
	-We can add new observers at any time
	-We never need to modify the subject to add new
	types of observers -> will update any observer
	that implements the observer interface
	-We can re use subjects or observers independently
	of each other
	-Changes to either the subject or an observer
	will not affect the other
** We should strive for loosely coupled designs between objects
that interact **
