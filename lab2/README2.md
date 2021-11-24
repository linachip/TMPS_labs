# Laboratory Work #2
## Topic: *Structural Design Patterns*
Author: *Cipciu Lina, FAF-193*
-----
## Objectives:
_1. Study and understand the Structural Design Patterns._

_2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to 
provide to the user._

_3. Implement some additional functionalities using structural design pattern._

## Theoretical background:
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships. These patterns focus on, how 
the classes inherit from each other and how they are composed from other classes.

There are following 7 types of structural design patterns.
* **Adapter Pattern** (Match interfaces of different classes).
* **Bridge Pattern** (Separates an object's inheritance from its implementation).
* **Composite Pattern** (A tree structure of simple and composite objects).
* **Decorator Pattern** (Add responsibilities to objects dynamically).
* **Facade Pattern** (A single class that represents an entire subsystem).
* **Flyweight Pattern** (A fine-grained instance used for efficient sharing).
* **Proxy Pattern** (An object representing another object).

## Used Design Pattern:
For this laboratory work #2 I decided to implement 3 structural design patterns such as:
* Bridge Pattern
* Composite Pattern
* Proxy Pattern

## Implementation:
The chosen domain Camera Characteristics. The project separated into 3 main packages:
* bridge
* composite
* proxy

#### Bridge
Bridge Pattern is a structural design pattern that lets you split a larger class or a set of closely related classes into
two separate hierarchies-abstraction and implementation-which can be developed independently of each other.
In my case the bridge pattern was implemented in order to find out what sensor type has digital and mirrorless camera. 
An interface ISensorType is the implementor for bridge pattern. The Camera abstract class is the abstraction in this patter.
In two classes DigitalCamera and MirrorlessCamera I refine the abstraction. The classes CCD, CMOS and EMCCD are the concrete implementation
for my bridge pattern.
````
	System.out.println("\n");
	com.tmpslab2.bridge.Camera MirrorlessCamera = new com.tmpslab2.bridge.MirrorlessCamera(new CMOS());
	MirrorlessCamera.characteristics();
	com.tmpslab2.bridge.Camera DigitalCamera = new com.tmpslab2.bridge.DigitalCamera(new CCD());
	DigitalCamera.characteristics();
````

#### Composite
Composite is a structural design pattern that compose objects into tree structures to represent whole-part hierarchies.
Composite lets clients treat individual objects and compositions of objects uniformaly. This pattern was implemented in 
order to find out the information regarding camera characteristics, such as camera type, brand, model, skill level and price.
````
System.out.println("Camera characteristics: " + "\n");
	Camera dslrCamera = new DSLRCamera("Nikon", "D750", "Professional", "999 USD");
	Camera dslrCamera2 = new DSLRCamera("Canon", "EOS 80d", "Professional", "949 USD");
	Camera digitalCamera = new DigitalCamera("Kodak", "PIXPRO FZ53", "Amateur", "90 USD");
	Camera digitalCamera2 = new DigitalCamera("Olympus", "Tough TG-6", "Amateur", "429 USD");
	Camera mirrorlessCamera = new MirrorlessCamera("Sony", "ALPHA A6000", "Professional", "599 USD");

	dslrCamera.add(dslrCamera2);
	System.out.println(dslrCamera.toString());
	dslrCamera2.add(digitalCamera);
	System.out.println(dslrCamera2.toString());
	System.out.println(digitalCamera.toString());
	digitalCamera.add(digitalCamera2);
	System.out.println(digitalCamera2.toString());
	System.out.println(mirrorlessCamera.toString());
````

#### Proxy
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy object
and control access to it. We can use proxy when we may want to use a class that can perform as an interface to something 
else. This pattern in my case have a IDSLRCamera which client need to access to description. It will ask the framework
to provide an instance of DSLRCamera, but as the access to this object needs to be quarded, framework returns the reference
to DSLRCameraProxy.
````
	System.out.println("\n");
	IDSLRCamera fileFormat = new DSLRCameraProxy();
	fileFormat.description();
````

## Conclusion:
During the laboratory work #1 I analyzed structural design patterns and after studying all the theory materials, try to
implement structural design patterns such as Bridge, Composite and Proxy. 
Additionally, structural design patterns show how to relate different pieces of a system together in a flexible and 
extensible fashion. Summing up, they help us guarantee that when one of the parts changes, the entire structure does not 
need to change. 

The result of the implemented work you can see in the Main class.
````
Camera characteristics: 

DSLR Camera:     Brand: Nikon    Model: D750    Skill level: Professional    Price: 999 USD
DSLR Camera:     Brand: Canon    Model: EOS 80d    Skill level: Professional    Price: 949 USD
Digital Camera:     Brand: Kodak    Model: PIXPRO FZ53    Skill level: Amateur    Price: 90 USD
Digital Camera:     Brand: Olympus    Model: Tough TG-6    Skill level: Amateur    Price: 429 USD
Mirrorless Camera:     Brand: Sony    Model: ALPHA A6000    Skill level: Professional    Price: 599 USD


Mirrorless Camera - Sony Alpha 7 has a sensor type: 
Complementary metal-oxide-semiconductor (CMOS)
Digital Camera - Olympus XZ-1 has a sensor type: 
Charge-coupled device (CCD)


DSLR Camera has file format: 
RAW file format

Process finished with exit code 0
````