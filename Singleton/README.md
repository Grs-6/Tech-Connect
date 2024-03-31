SINGLETON DESIGN PATTERN


The Singleton design pattern belongs to the creational design pattern.
Creational design patterns deal with object creation mechanisms.

The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance.
It is commonly used in scenarios where you need exactly one instance of a class to coordinate actions across the system.

Singleton Design pattern is part of the creational patterns because it provides control over the instantiation process, ensuring that only one instance of the class is created.

This code demonstrates the implementation of the singleton design pattern using a class called AttendanceKeeper.
It ensures that only one instance of AttendanceKeeper is created and provides a global point of access to that instance through the getInstance() method.
The markAttendance() method is used to mark attendance, and the keeper attribute represents the entity responsible for attendance management.

In this code, attendance is managed by a class representative, regardless of how many times attendance is marked it is still marked by a single person. This illustrates that despite multiple attempts to create objects, only one instance is ultimately created, reflecting the singleton pattern's behavior.

This is useful on managing a centralized resource or configuration settings. 
This also avoids creation of multiple objects which can lead to resource wastage and performance degradation
improper implementation of the singleton pattern can result in issues such as thread safety concerns and potential memory leaks.
