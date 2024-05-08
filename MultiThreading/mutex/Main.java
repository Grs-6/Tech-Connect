package mutex;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Employee employee1 = new Employee("Alice", printer);
        Employee employee2 = new Employee("Bob", printer);

        employee1.start();
        employee2.start();

        employee1.join();
        employee2.join();
    }
}
