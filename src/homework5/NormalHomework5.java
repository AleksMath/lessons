package homework5;

public class NormalHomework5 {
    public static void main(String[] args) {

        Driver driver1 = new Driver();
        driver1.driverName = "Толик";
        driver1.driveTime = 20;

        Engine engine1 = new Engine();
        engine1.power = 380;
        engine1.carMaker = "Toyota.co";

        Car car1 = new Car();
        car1.carName = "ToyotaLandCruiser";
        car1.classAuto = "fourWeelDrive";
        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();

    }
}
    class Driver{
        public String driverName;
        int driveTime;
    }
    class Engine {
        int power;
        String carMaker;
    }
    class Car{
        String carName;
        String classAuto;
        int weight;
        void start() {System.out.println("Поехали");}
        void stop() {System.out.println("Останавливаемся");}
        void turnRight() {System.out.println("Поворот направо");}
        void turnLeft () {System.out.println("Поворот налево");}

        }



