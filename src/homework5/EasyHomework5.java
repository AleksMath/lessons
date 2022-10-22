package homework5;

public class EasyHomework5 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 40;
        person1.fullName = "Герман";
        person1.move();
        person1.talk();
    }
}
class Person {
    String fullName;
    int age;
    void move () {
        System.out.println( fullName+ " ему " + age + " лет" + " он ходит");
    };
    void talk () {
        System.out.println( fullName + " ему " + age + " лет" + " он говорит");
    }
}
