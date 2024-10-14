public class Main {
    public static void main(String[] args) {
        System.out.println("Executing Task 1: Adapter Pattern");
        Task1 task1 = new Task1();
        task1.execute();

        System.out.println("\nExecuting Task 2: Bridge Pattern");
        Task2 task2 = new Task2();
        task2.execute();

        System.out.println("\nExecuting Task 3: Composite Pattern");
        Task3 task3 = new Task3();
        task3.execute();

        System.out.println("\nExecuting Task 4: Decorator Pattern");
        Task4 task4 = new Task4();
        task4.execute();
    }
}
