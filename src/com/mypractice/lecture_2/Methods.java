package com.mypractice.lecture_2;

public class Methods {
    public static void main(String[] args) {
        eat();
        int v = eatWithReturn();
        eatFruit(5);
        int s = sum(30, 20);
        System.out.println(s);
    }

    public static void eat() {
        System.out.println("yumm yumm");
    }

    public static int eatWithReturn() {
        System.out.println("yumm yumm and return");
        return 0;
    }

    public static void eatFruit(int val) {
        System.out.println("eating " + val);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

}
