# java-patterns-implementations
Personal implementations in java of several patterns with usage example ready to use.
___
## Database
### DAO & DTO
Data Access Object & Data Transfer Object.
DAO - Design pattern, used to encapsulate the access to a persistence resource (e.g a database) and eliminate dependencies which come with the implementation of the code.
DTO is the object which representates an entity of the database, with all its own properties to be manipulated.
___

## Design
### Façade
Helps with MVC. Establishes a new layer to separate and encapsulate the code between view & controller.

### Singleton
Limits and sets a way to access an unique object instantiation during the whole execution of a program.

### State
Allows to change the behaviour of an object through its own state. Depending the state the object is at, allows to manipulate it one way or another.

### Memento
Allows to restore an object to a previous state. It makes snapshots of the object and saves them, allowing later to restore any of them.

Behaviour pattern. It does save snapshots of a class, to be able to recover a previous state of an object. 
Parts: 
 * Originator - Class from which we save its states. e.g. a DTO. 
 * Memento - It's a Snapshot which saves the content of the Originator in a punctual state. 
 * Caretaker - Class where we do save the several Mementos. From it we do save or load Mementos.
 
___

## Creational
### Builder
Allows to create beans easily (and fluently) for cases where we have lots of parameters (+4-5), with some of them required and others optional.


### Factory
Uses factory methods to add an abstraction layout. Allows for example to be able to connect to several databases doing the swap by just changing two parameters in a config file.
___

### Patterns to take a look into
###### flyweight
###### service provider framework
###### bridge
###### adapter
