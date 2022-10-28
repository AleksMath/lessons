package Lesson8.modificators.p2;

import Lesson8.modificators.p1.A;

public class D {
    void test(){
        A a = new A();
        System.out.println(a.pablicVariable);
        a.pablickMethod();

        //System.out.println(privateVariable);
        //privateMethod();

        //System.out.println(defaultVariable);
        //defaultMethod();
        //System.out.println(protectVariable);
        //protectMethod();
    }
}
