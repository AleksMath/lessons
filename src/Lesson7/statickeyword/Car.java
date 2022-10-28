package Lesson7.statickeyword;

public class Car {

    private static int numberOfCars;
    private static String color = "Green";

    public Car(String color) {
        this.color = color;
        numberOfCars++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfCars=" + numberOfCars +
                ", color='" + color + '\'' +
                '}';
    }
}

