package com.qinxc.basic;


public class TestInherit {

    public static void main(String[] args) {

        father father = new father();
        father child = new child();
//        System.out.println(father.num);
        father.target();
//        System.out.println(child.num);
        child.target();

        child testInhert = new child();
        testInhert.a();
    }

}

class father {
    public int num;

    public void target() {
        System.out.println(num);
        System.out.println("father");
    }

    public void a() {
        System.out.println("a");
        System.out.println(this);
        b();
    }

    public void b() {
        System.out.println("b");
        System.out.println(this);
    }

}

class child extends father {
    public int num = 2;

    public void a() {
        System.out.println("aa");
        System.out.println(this);
        super.a();
    }

//    public void b() {
//        System.out.println("bb");
//        System.out.println(this);
//    }
}