package semaphore;

public class Main {
    public static void main(String[] args) {
        int numOfPrinters = 2; // Number of available printers
        PrinterPool printerPool = new PrinterPool(numOfPrinters);

        String[] documents = {"Document 1", "Document 2", "Document 3", "Document 4", "Document 5"};

        for (String doc : documents) {
            Thread employeeThread = new Employee(printerPool, doc);
            employeeThread.start();
        }
    }
}
