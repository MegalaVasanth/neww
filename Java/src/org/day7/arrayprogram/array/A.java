package org.day7.arrayprogram.array;

class A {
    String s = "I am just a object";
    @Override
    public String toString()
    {
        return s;
    }
}

class B {
    public static void main(String args[])
    {
        A obj = new A();
        System.out.println(obj);
    }
}