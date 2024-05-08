package semaphore;

class Employee extends Thread {
    private static int nextEmployeeId = 1; // Static variable to generate unique employee IDs
    private final PrinterPool printerPool;
    private final String document;
    private final int employeeId;

    public Employee(PrinterPool printerPool, String document) {
        this.printerPool = printerPool;
        this.document = document;
        this.employeeId = nextEmployeeId++; // Assign and increment employee ID
    }

    public void run() {
        printerPool.printDocument(document, employeeId);
    }
}