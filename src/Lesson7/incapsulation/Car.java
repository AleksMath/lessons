package Lesson7.incapsulation;

public class Car {
    private Engine engine = new Engine();
    void start(){
        engine.start();
        System.out.println("Starting car");
    }
   /* Engine getEngine() {
        return engine;
    }
    void setEngine(Engine e) {
        engine = e;
    }*/
}
