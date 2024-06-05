## Inter-Process Communication (IPC) with Shared Memory in Java

This project demonstrates Inter-Process Communication (IPC) using shared memory in Java. It includes a producer that writes data to shared memory and a consumer that reads the data from the shared memory. The example adheres to SOLID principles and follows Object-Oriented Programming (OOP) concepts.

## Overview

This project demonstrates a simple IPC mechanism using shared memory. The producer generates random sensor data and writes it to a shared memory file. The consumer reads the data from the shared memory and displays it. Both processes use a common file mapped into memory for communication.

## Architecture

The project is structured into the following components:

- Shared Memory Setup: Sets up a shared memory file.
- Renderer: Interface and implementation for rendering data.
- Data Producer: Interface and implementation for producing data.
- Data Consumer: Interface and implementation for consuming data.
- Main Class: Demonstrates the IPC by running the producer and consumer.

## Class Descriptions

### SharedMemorySetup.java:
This class is responsible for setting up the shared memory by creating and mapping a file into memory. It provides a method to initialize the shared memory file, making it accessible for both the producer and consumer processes.

### Renderer.java:
The Renderer interface defines a contract for rendering data. It declares a single method, render(int data), which is intended to display or process the given data in various ways depending on the implementation.

### ConsoleRenderer.java:
The ConsoleRenderer class is an implementation of the Renderer interface that renders data to the console. It prints the integer data to the standard output, providing a simple way to visualize the data being processed.

### DataProducer.java:
The DataProducer interface defines the contract for producing data. It declares the produce() method, which is responsible for generating and writing data to the shared memory.

### SensorDataProducer.java:
The SensorDataProducer class implements the DataProducer interface and is responsible for simulating sensor data production. It writes random integer data to the shared memory at regular intervals and uses the Renderer to display the data.

### DataConsumer.java:
The DataConsumer interface defines the contract for consuming data. It declares the consume() method, which is responsible for reading data from the shared memory.

### SensorDataConsumer.java:
The SensorDataConsumer class implements the DataConsumer interface and is responsible for reading data from the shared memory. It continuously reads and renders the data until a termination signal is encountered.

### Main.java:
This is the main class that demonstrates the IPC mechanism using shared memory. It sets up the shared memory, initializes the producer and consumer, and starts them in separate threads to simulate concurrent data production and consumption.