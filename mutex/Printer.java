package mutex;

public class Printer {
    public synchronized void printDocument(String document, String employeeName) {
        System.out.println(employeeName + " is printing: " + document);
        // Simulate printing process
        try {
            Thread.sleep(2000); // Simulating printing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(employeeName+" finished printing");
    }
}
