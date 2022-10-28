package Lesson8.modificators.p2;

import Lesson8.modificators.p1.A;

public class E extends A {
    void test(){
        System.out.println(pablicVariable);
        pablickMethod();

        //System.out.println(privateVariable);
        //privateMethod();

        //a.System.out.println(defaultVariable);
        //a.defaultMethod();
        System.out.println(protectVariable);
        protectMethod();
    }
}
