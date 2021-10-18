package com.company.day2;

class Data {

    public void foo() {
        System.out.println("foo");
    }

    public void bar() {
        System.out.println("bar");
    }
}
public class FileError {
    public static void main(String[] args) {

        Data d = new Data();
        d.foo();
        d.bar();
    }

}
