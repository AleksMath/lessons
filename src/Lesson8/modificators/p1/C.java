package Lesson8.modificators.p1;

public class C {
    void test(){
        A a = new A();
        System.out.println(a.pablicVariable);
        a.pablickMethod();

        //System.out.println(a.privateVariable);
        //a.privateMethod();

        System.out.println(a.defaultVariable);
        a.defaultMethod();

        System.out.println(a.protectVariable);
        a.protectMethod();

    }
}
