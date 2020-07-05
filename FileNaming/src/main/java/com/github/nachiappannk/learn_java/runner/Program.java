package com.github.nachiappannk.learn_java.runner;

import com.github.nachiappannk.learn_java.MyClass;

public class Program {
    public static void main(String[] args) {
        System.out.println(MyClass.Name);

        //The below line will throw compilation error, as Another class is package private
        //System.out.println(AnotherClass.Name);
    }
}
