package com.github.nachiappannk.learn_java;

public class OuterClass {
    private int somePrivateField;
    protected int someProtectedField;
    public int somePublicField;
    int someDefaultField;

    public static class InnerClass1 {
        public void test(){

            //Static inner classes can not access the outer class memebers
            /*
            somePrivateField = 0;
            someProtectedField = 0;
            someDefaultField = 0;
            somePublicField = 0;
             */
        }
    }

    public class InnerClass2 {
        public void test(){
            //The inner class members can access class members
            somePrivateField = 0;
            someProtectedField = 0;
            someDefaultField = 0;
            somePublicField = 0;
        }
    }
}
