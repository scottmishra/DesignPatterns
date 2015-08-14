The Command Pattern:

Common flow of the command pattern:
-The client creates a command object that consists of a set of actions on a receiver
	The actions and the receiver are bound together in the command object
	The Command object has 1 method that encapsulates the action, and can be called to invoke the 
	action on the receiver
-The client calls setCommand() to store the command object in the invoker
-At some point in the future the invoker call the execute() method to call all the actions methods,
which results in the actions being invoked on the receiver 

The Command Pattern: encapsulates a request as an object,
thereby letting you parameterize other objects with different requests, queue or log requests,
and support undoable operations

The command pattern is able to decouple the client and receiver through the command object.
The client only knows how to call or undo an action, not how it is done or what is really done.