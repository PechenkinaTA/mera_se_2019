package com.mera.students.lecture3.subpackage;

import com.mera.students.lecture3.SomeClass;

public class AnotherClass {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.x);
        someClass.x = 48;
        System.out.println(someClass.x);
    }
}
