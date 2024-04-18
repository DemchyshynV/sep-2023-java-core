package hw2.task2;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 16, 15.5);
        Ultrabook ultrabook = new Ultrabook(6, 8, 11.2, 2);
        WorkStation workStation = new WorkStation(22, 32, 17.0, "NVIDIA");

        System.out.println(laptop);
        System.out.println(ultrabook);
        System.out.println(workStation);

    }
}
