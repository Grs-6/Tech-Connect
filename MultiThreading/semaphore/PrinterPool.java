package semaphore;
import java.util.concurrent.Semaphore;

class PrinterPool {
    private final Semaphore semaphore;

    public PrinterPool(int numOfPrinters) {
        semaphore = new Semaphore(numOfPrinters);
    }

    public void printDocument(String document, int employeeId) {
        try {
            semaphore.acquire(); // Acquire a permit
            System.out.println("Employee " + employeeId + " is printing document: " + document);
            Thread.sleep(2000); // Simulate printing
            System.out.println("Employee " + employeeId + " finished printing.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit
        }
    }
}


