# Semaphore

A semaphore is a synchronization primitive used to control access to a shared resource. 
It maintains a counter that represents the number of available resources and provides methods for threads to block or unblock based on the availability of those resources.

## Execution

 This example has PrinterPool class that manages a pool of printers using a semaphore. 
 Each employee, represented by an Employee thread, requests permission to print a document from the printer pool.
 The semaphore ensures that only a limited number of employees can access the printers simultaneously. 
 When an employee finishes printing, it releases the permit, allowing another employee to use the printer. 
 This mechanism prevents resource contention and ensures efficient utilization of the shared printers while maintaining data integrity and avoiding race conditions.

## Characteristics

- Counting Mechanism: Semaphores maintain a counter representing the number of available resources or permits.
- Resource Synchronization: Semaphores provide a means for controlling access to shared resources in multithreaded environments, allowing only a limited number of threads to access the resource simultaneously.
- Non-Ownership: Unlike mutexes, which are owned by the thread that acquires them, semaphores do not have an owner; any thread can release a permit, regardless of which thread acquired it.




