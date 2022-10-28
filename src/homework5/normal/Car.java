package homework5.normal;

public class Car {
    String carName;
    String classAuto;
    int weight;

    Driver driver;

    Engine engine;

    void start() {
        System.out.println("Поехали");
    }

    void stop() {
        System.out.println("Останавливаемся");
    }

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Автомобиль марки" + carName + "водитель" + driver.driverName;
    }

}
