# Laboratory Work #3
## Topic: *Behavioral Design Patterns*
Author: *Cipciu Lina, FAF-193*
-----
## Objectives:
_1. Study and understand the Behavioral Design Patterns._

_2. As a continuation of the previous laboratory work, think about what communication between software entities might 
be involved in your system._

_3. Implement some additional functionalities using behavioral design pattern._

## Theoretical background:
Behavioral design patterns are design patterns that identify common communication patterns between objects and realize 
these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

There are following 11 types of behavioral design patterns.
* **Chain of responsibility Pattern** (A way of passing a request between a chain of objects).
* **Command Pattern** (Encapsulates a command request as an object).
* **Interpreter Pattern** (A way to include language elements in a program).
* **Iterator Pattern** (Sequentially access the elements of a collection).
* **Mediator Pattern** (Defines simplified communication between classes).
* **Memento Pattern** (Capture and restore an object's internal state).
* **Observer Pattern** (A way of notifying change to a number of classes).
* **State Pattern** (Alter an object's behavior when its state changes).
* **Strategy Pattern** (Encapsulates an algorithm inside a class).
* **Template method Pattern** (Defer the exact steps of an algorithm to a subclass).
* **Visitor Pattern** (Defines a new operation to a class without change).

## Used Design Pattern:
For this laboratory work #3 I decided to implement 1 behavioral design pattern such as State Design Pattern.

## Implementation:
In state pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern. 
We create objects which represent various states and a context object whose behavior varies as its state object changes.

I implemented a Camera Flash State scenario. The camera flash can be in three different states, such as red when the flash
is running, green when the flash isn't charged and flashing green when the flash is in the sleep mode.

CameraFlashState is an interface for declaring what each state should do. An interface contains the handle() method.
````
public interface CameraFlashState {
    void handle(FlashStateContext context);
}
````
FlashStateContext is a class of context. It maintains references to concrete state object which may be used to define current
state of object.
````
public class FlashStateContext {

    CameraFlashState flashState;

    public FlashStateContext(){
        flashState = null;
    }

    public void setFlashState(CameraFlashState flashState) {
        this.flashState = flashState;
    }

    public CameraFlashState getState(){
        return flashState;
    }
}
````
Classes Red, Green and Flashing Green is a concrete states of the flash. Concrete classes provide implementation for methods defined
in CameraFlashState. 
````
public class Red implements CameraFlashState {

    @Override
    public void handle(FlashStateContext context) {
        System.out.println("The flash is fully ready to work");
        context.setFlashState(this);
    }

    public String toString(){
        return "Red state";
    }
}
````

##Conclusion:
During the laboratory work #3 I analyzed behavioral design patterns and after all the theory materials, try to implement 
a behavioral design pattern such as State Design Pattern. 
Behavioral object patterns accomplish tasks that would be difficult or impossible to accomplish with single objects. 
Furthermore, they generally make the entire flow simpler, more understandable, and more robust than the 
string-and-bailing-wire solutions that are built without a clear design in mind. 

The result of the implemented work you can see in the Main class.
````
The first camera has a flash state:
The flash is fully ready to work
Red state


The second camera has a flash state:
The flash isn't charged
Green state


The third camera has a flash state:
The flash is in the sleep state
Flashing green state

Process finished with exit code 0
````