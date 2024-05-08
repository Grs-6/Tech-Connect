package mutex;

public class Employee extends Thread {
    private String name;
    private Printer printer;

    public Employee(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    public void run() {
        String document = "Document by " + name;
        printer.printDocument(document, name);
    }
}