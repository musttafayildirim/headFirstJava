package com.company;

public class InterfaceImplementEdenClass implements Interface1{

    @Override
    public void interfaceAbstractMethod1() {
        System.out.println("InterfaceImpemente eden sınıfın metodu");
    }

    public static void main(String[] args) {
        InterfaceImplementEdenClass interfaceImplementEdenClass = new InterfaceImplementEdenClass();
        interfaceImplementEdenClass.interfaceAbstractMethod1();
    }
}
