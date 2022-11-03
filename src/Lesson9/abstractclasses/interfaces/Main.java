package Lesson9.abstractclasses.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.say();
        animal = new Duck();
        animal.say();
    }
}
