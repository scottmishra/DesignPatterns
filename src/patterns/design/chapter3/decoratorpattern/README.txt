Chapter 3: The Decorator Pattern

The Decorator Pattern attaches additional responsibilities to an object
dynamically. Decorartors provide a flexible alternative to subclassing
for extending functionallity

The Open-Closed Principle -> Classes and code should be free to be extended upon, but
existing code should be closed to alteration. But, this shouldnt be used everywhere as it
can be a waste of time. Only the most complex or useful pieces of code should be designed
in this manner. 

-Decorators have the same supertype as the objects they decorate
-You can use one or more decorators to wrap an object
-Given that the decorator has the same supertype as the object it decorates,
we can pass around a decorated object in place of the original
-The decorator adds its own behavior either before and/or after delegating to 
the object it decorates to do the rest of the job**
-Objects can be decorated at any time, so we can decorate objects dynamically
at runtime with as amny decorators as we like.

-Decorators are generally encapsulated in other patterns rather than being 
used alone.

-Decorators can be seen in the real world such as the Java IO package,
bufferedreader(inputstreamreader(inputstream))