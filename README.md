# <span style = "color:cyan" > Factory Pattern </span>

## <span style = "color:pink" >What is the Factory Pattern?</span>

### <span style="color:lightgrey">The Factory pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It is used to decouple the object creation logic from the rest of the code, making it easier to extend and maintain the application.

## <span style = "color:pink" >Why is it used?</span>

### <span style="color:lightgrey"> It is used to create objects without exposing the instantiation logic to the client. This makes the code more flexible and scalable because it allows for the creation of objects without tightly coupling the code to a specific class. Additionally, it enables the creation of objects based on runtime conditions or configurations, making it suitable for complex systems with multiple object types.

## <span style = "color:pink" > How does it work?</span>

### <span style="color:lightgrey"> 1- Define the Factory interface:
Create an interface or abstract class that defines the method to create objects. This will be implemented by the concrete factory classes. In the example of shapes, the Factory abstract class would define the method "getShape()".

### <span style="color:lightgrey"> 2- Implement the concrete factory classes:
Create separate classes for each type of object to be created, extending the Factory abstract class. Each concrete factory class will provide its own implementation of the method to create objects. In the shape example, the concrete factory classes could be "CircleFactory", "RectangleFactory", "TriangleFactory", and "SquareFactory".

### <span style="color:lightgrey"> 3- Call the create object method:
Call the method of the concrete factory class to create the object. This method will create and return the object of the appropriate type. In the shape example, we could call the "getShape()" method of the "CircleFactory" to create a circle shape object.

### <span style="color:lightgrey"> 4- Use the created object:
Use the created object as required by the application. In the shape example, we could use the created circle shape object to draw a circle.

                  +-----------------+
                  |     Factory     |
                  +-----------------+
                  |   getShape()    |
                  +-----------------+
                           /\
                           |
                           |
           +-----------------------------+
           |      CircleFactory          |
           +-----------------------------+
           |     getShape()              |
           +-----------------------------+
                           /\
                           |
                           |
        +--------------------------------+
        |      RectangleFactory          |
        +--------------------------------+
        |     getShape()                 |
        +--------------------------------+
                           /\
                           |
                           |
         +-------------------------------+
         |      TriangleFactory         |
         +-------------------------------+
         |     getShape()               |
         +-------------------------------+
                           /\
                           |
                           |
            +-----------------------------+
            |      SquareFactory          |
            +-----------------------------+
            |     getShape()              |
            +-----------------------------+
