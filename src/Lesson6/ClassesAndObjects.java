package Lesson6;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();        //создали объекты класса Person
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        person1.sayHello();
        int years1 = person1.calculateToRetirement();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
        int years2 = person2.calculateToRetirement();
        System.out.println("Первому человеку до пенсии " + years1 + "лет");
        System.out.println("Второму человеку до пенсии " + years2 + "лет");
    }
}
class Person {     //создали класс
    String name;   //данные класса (поля)
    int age;
    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " Мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
    int calculateToRetirement(){
        int years = 65 - age;
        return years;
    };

}