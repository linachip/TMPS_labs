# Laboratory Work #1
## Topic: *Creational Design Patterns*
Author: *Cipciu Lina, FAF-193*
-----
## Objectives: 
_1. Study and understand the Creational Design Patterns._

_2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanism._

_3. Use some creational design patterns for object instantation in a sample project._

## Main Tasks:
_1. Choose an OO programming language and a suitable IDE or Editor._

_2. Select a domain area for the sample project._

_3. Define the main involved classes and think about what instantiation mechanism are needed._

_4. Based on the previous point, implement at least 3 creational design patterns in your project._

## Theory:
Creational design patterns are design patterns that deal object creation mechanism, trying to create objects in a manner
suitable to the situation. The basic form of object creation could result in design problems or added complexity to the
design. Creational design patterns solve this problem by somehow controlling this object creation.

There are some examples of such design patterns as:
* **Abstract Factory** (Creates an instance of several families of classes)
* **Builder** (Separates object construction from its representation)
* **Factory Method** (Creates an instance of several derived classes)
* **Object Pool** (Avoid expensive acquisition and release of resources by recycling objects that are no longer in use)
* **Prototype** (A fully initialized instance to be copied or cloned)
* **Singleton** (A class of which only a single instance can exist)

## Used Design Patterns:
For this laboratory work #1 I decided to implement 3 creational design patterns such as:
* Singleton Pattern
* Builder Pattern
* Factory Pattern

## Implementation:
The chosen domain was Camera Creation. The project separated into 3 main packages:
* singleton (includes a class CameraManager)
* builder (includes two classes Camera and CameraBuilder)
* factory (includes an interface Camera, three classes and one enum)

#### Singleton
Singleton pattern involves a single class which is responsible to create an object while making sure that only single 
object gets created. This class provides a way to access its only object which can be accesses directly without need to 
instantiate the object of the class.
```
public class CameraManager {
    private static CameraManager cameraManager;
    private String name = "Professional camera";
    private String name2 = "Amateur camera";

    public static CameraManager getInstance(){
        if(cameraManager == null){
            cameraManager = new CameraManager();
        }
        return cameraManager;
    }

    public String getName(){
        return name;
    }

    public String getName2(){
        return name2;
    }
}
```

#### Builder
Builder pattern builds a complex object using a simple objects and using a step by step approach. This type of design 
pattern comes under creational pattern as this pattern provides one of the best ways to create an object. A Builder 
class builds the final object step by step. This builder is independent of other objects.
````
public class CameraBuilder {
    private String brand;
    private String color;
    private String sensorType;
    private int maximumResolution;

    public CameraBuilder(){}

    public CameraBuilder brand(String brand){
        this.brand = brand;
        return this;
    }

    public CameraBuilder color(String color){
        this.color = color;
        return this;
    }

    public CameraBuilder sensorType(String sensorType){
        this.sensorType = sensorType;
        return this;
    }

    public CameraBuilder maximumResolution(int maximumResolution){
        this.maximumResolution = maximumResolution;
        return this;
    }
````

#### Factory Method
Factory pattern or Factory methods is one of the most used design patterns in Java. This type of design pattern comes 
under creational pattern as this pattern provides one of the best ways to create an object. In Factory pattern, we create
object without exposing the creation logic to the client and refer to newly created object using a common interface.
````
public class CameraFactory {
    public static DSLRCamera buildCamera(String types){

        if (types == null){
            return null;
        }

        if (types.equalsIgnoreCase("DSLRCamera")){
            return new DSLRCamera();
        }
        return null;
    }

    public static DigitalCamera buildCamera2(String types2){
        if (types2 == null){
            return null;
        }

        if (types2.equalsIgnoreCase("DigitalCamera")){
            return new DigitalCamera();
        }
        return null;
    }
}
````

## Conclusion
During the laboratory work #1 I analyzed and implemented creational design patterns. Creational design pattern abstracts 
the instantiation proccess. Additionally, it helps in making the system independent of how its objects are created, composed
and represented. I understood that creational patterns provide object creation mechanism that can create objects in a controlled
manner that are suitable to the situation. In this way, they help reduce complexities and instability, while also offering 
increased flexibility and allowing for the reuse of code.