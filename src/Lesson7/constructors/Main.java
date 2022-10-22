package Lesson7.constructors;

public class Main {
    public static void main(String[] args) {
       User user = new User();
//        user.setName("Вася");
//        user.setAge(35);

        System.out.printf("Привет! меня зовут %s, мне %d лет\n,", user.getName(), user.getAge());
    }
}
