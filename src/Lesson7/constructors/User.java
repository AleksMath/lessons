package Lesson7.constructors;

public class User {
    private String name;
    private int age;

    User(){ //конструктор
        System.out.println("Hello constructor without paramters");
        this.name = "Безымянный";
        this.age = 0;
    }
    User(String name) {
        System.out.println("Hello from constructor with one parameter");
        this.name = name;
        this.age = 0;
    }

    public User(String name, int age) {

        System.out.println("Hello from constructor with two parameters");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
