package hw2.task2;

public class Laptop extends PC {
    private int weight;

    public Laptop() {

    }

    public Laptop(int CPUs, int RAM, double monitor) {
        super(CPUs, RAM, monitor);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
