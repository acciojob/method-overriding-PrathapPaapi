package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj2 = new B();
        obj2.meth();
    }

    public static class A{
        public static String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        public static String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}