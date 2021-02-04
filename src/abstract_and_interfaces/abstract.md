# Abstract Classes and Interfaces FAQ
​
### Abstract Classes
​
**What is an abstract class in Java?**
​
A class that may have one or more abstract methods. It cannot be instantiated and must be extended by a subclass.
​
​
**What is an abstract method?**
​
A method without a body (implementation). It must be fully defined in the first non-abstract subclass.
​
​
**What's the point? Why are abstract classes useful?**
​
Basically, it helps create a more clear and flexible inheritance hierarchy. An abstract class allows a general type of or category of partially defined state and behavior that may be inherited but doesn't make sense to be instantiated in its own right.
​
​
**Can an abstract class have zero abstract methods?**
​
Yes
​
​
**Can an abstract class extend another abstract class?**
​
Yes. For example:
​
abstract class Being {}
abstract class Human extends Being {}
abstract class American extends Human {}
class Fred extends American {}
​
​
**Does an abstract subclass have to implement the abstract methods of the superclass?**
​
No
​
​
**Can it define the implementation anyway?**
​
Yes
​
​
**Can an abstract class have static fields?**
​
Yes
​
​
**Can an abstract class be marked final?**
​
Nope. That would be silly. However, individual methods can be marked final in an abstract class.
​
### Interfaces
​
​
**What is an interface?**
​
A class-like definition that cannot be directly instantiated and ONLY contains constants and (or) public abstract methods. It may be implemented by another class, abstract class, or interface.
​
​
**Why is it useful?**
​
Interfaces are great for creating general methods that other parts of an application may assume a given object will have that implements the interface methods. This allows us to write code that doesn't depend on how a given object implements the interface methods (an example of both the power of abstraction and polymorphism).
​
The type of a given object can also be declared as the type of an interface it implements.
​
​
**What's the difference between abstract classes and interfaces?**
​
A fine question. Besides the technical limitation: an abstract class can have properties with values and methods with defined implementation while interfaces cannot and, a class may extend only one abstract class but may implement any number of interfaces, the biggest difference lies in the use case of each structure...
​
Abstract classes should be used when the relationship between it and a subclass falls in the "is a type of" relationship. Is a Pug a type of Dog? Yes, so Dog makes sense as a class or abstract class. Is a Pug a type of Walkable? NO! However, a Pug "can be" Walkable. An interface is simply a way of grouping things that an object can do.
​
​
**Do interfaces always end in "able"?**
​
No, but it is a common convention to see interface names ending in "able".
​
​
**Can an interface be implemented by another interface?**
​
Yep
​
​
**Can an interface extend another class?**
​
No. An interface cannot implement any methods.
​
​
**Do I need to include the abstract keyword when declaring a method in an interface?**
​
No. The abstract keyword is implied.
​
​
**Can a class both extend another class or abstract class and implement any number of interfaces?**
​
Yes, all the time!