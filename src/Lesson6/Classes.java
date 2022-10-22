package Lesson6;

public class Classes {
    public static void main(String[] args) {
        User user = new User();
//        user.name = "Ivan";
//        user.age = 20;
//        user.setName("Арнольд");
//        user.setAge(64);
        user.setNameAndAge("Милан", 20);
        user.sayHello();
        user.speak();

        User user2 = new User();
        user2.name = "Vasia";
        user2.age = 30;;
        user2.speak();
        System.out.printf("\"А Меня зовут %s и я наглый, мне %d лет\n", user2.getName(), user2.getAge());
        int yearstoretirement = user.calculateYearstoretirement();
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("Hello from class Test");
    }
}
class Test2 {
    public static void main(String[] args) {
        System.out.println( "Hello from class Test 2");
    }
}
class User {
    String name;//свойства
    int age;

    void speak() {
        System.out.printf("Меня зовут %s, мне %d лет\n", name, age);
        };
    void sayHello () {
        System.out.println("Привет");
    }
    int calculateYearstoretirement(){
        int yearstoretirement = 65 - age;
        System.out.printf("Осталось %d лет до пенсии", yearstoretirement);
        return yearstoretirement;
    }

    void setName(String n) {
        name = n;
    }
    void setAge(int a){
        age = a;
    }
    void setNameAndAge(String n, int a) {
        name = n;
        age = a;
    }
    String getName(){
        return name;
    }
    int getAge() {
        return age;
    }
}
