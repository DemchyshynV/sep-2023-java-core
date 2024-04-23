package hw4.task3;

import java.util.Objects;

public class Pet {
    private int id;
    private Animal animal;
    private String name;

    public Pet() {
    }

    public Pet(int id, Animal animal, String name) {
        this.id = id;
        this.animal = animal;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId() && getAnimal() == pet.getAnimal() && Objects.equals(getName(), pet.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAnimal(), getName());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", animal=" + animal +
                ", name='" + name + '\'' +
                '}';
    }
}
