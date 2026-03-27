package entities;

public class Persons {
    public String name;
    private int age;
    private double height;

    public Persons(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Persons(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height= %.2f" + height +
                '}';
    }
}
