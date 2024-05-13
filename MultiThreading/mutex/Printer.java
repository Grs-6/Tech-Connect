package mutex;

public class Printer {
   private final Lock lock = new ReentrantLock();

    public void printDocument(String document, String employeeName) {
        lock.lock();
     
        try {
            System.out.println(employeeName + " is printing: " + document);
            Thread.sleep(2000); // Simulating printing time
            System.out.println(employeeName+" finished printing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
