#Mutex#

A mutex is a synchronization primitive used in multithreading to control access to shared resources. 
It ensures that only one thread can access the shared resource at a time, preventing race conditions and maintaining data integrity.

##Characteristics of Mutex##

-Mutual Exclusion: A mutex ensures that only one thread can hold the lock at a time, preventing concurrent access to the protected resource.
-Fairness: Mutexe can be implemented to provide fairness, ensuring that threads are granted access to the mutex in the order they requested it.
-Ownership: A mutex can be acquired and released only by the thread that currently holds it, ensuring that a thread cannot release a mutex it does not own.

##Execution##

This example has 2 employees(Alice and Bob) who are using a shared printer to print documents.
The Employee class represents each employee, and the Printer class represents the shared printer.
When each employee starts, they call the printDocument method of the Printer class to print their document.
Inside the printDocument method, a lock (ReentrantLock) is acquired before printing starts.
This ensures that only one thread can access the critical section (printing) at a time.
After printing is complete, the lock is released, allowing another thread to acquire it and print its document.
