package alishevExampls;

public class NewClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.setAge(30);
        person1.speak();
        person1.sayHello();
        System.out.println("выводим значение в main методе " + person1.getName());
        System.out.println("выводим значение в main методе " + person1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName (String userName) {
        name = userName;
    }
    public String getName(){
        return name;
    }

    public void setAge (int userAge){
        age = userAge;
    }
    public int getAge (){
        return age;
    }

    int calculateYearToRetuerment() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("меня зовут " + name + " мне " + age);
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

