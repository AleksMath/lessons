package Lesson7.inheritens;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.weight = 2.5;
        animal.say();

        Dog dog = new Dog();
        dog.weight = 3.4;
        dog.say();
        System.out.println(dog.someField);

        Cat cat = new Cat();
        cat.say();

        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1.equals(test2));
    }
}
