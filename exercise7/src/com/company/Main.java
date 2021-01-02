package com.company;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        System.out.println("İlk 3lü");

        b.m1();
        c.m2();
        a.m3();

        System.out.println("\n2. Üçlü ");
        c.m1();
        c.m2();
        c.m3();

        System.out.println("\n3. üçlü");
        a.m1();
        b.m2();
        c.m3();

        System.out.println("\n4. üçlü");
        a2.m1();
        a2.m2();
        a2.m3();
    }
}
