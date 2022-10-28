package Lesson8.modificators.p1;

public class A {
    public int pablicVariable;
    private int privateVariable;
    int defaultVariable;
    protected int protectVariable;

    public void pablickMethod() {
    }
    ;
    private void privateMethod() {
    }
    ;
    void defaultMethod() {
    }
    ;
    protected void protectMethod() {
    }
    ;
    void test() {
        System.out.println(pablicVariable);
        pablickMethod();

        System.out.println(privateVariable);
        privateMethod();

        System.out.println(defaultVariable);
        defaultMethod();

        System.out.println(protectVariable);
        protectMethod();
    }
    ;
}
