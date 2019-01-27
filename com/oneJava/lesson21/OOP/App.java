package com.oneJava.lesson21.OOP;

class Parent {}
class Child extends Parent {}
class ChildA extends Parent {}
class ChildB extends Parent {}
public class App {
    public static void main(String[] args) {
        Parent ref = (Parent) new Child();
    }
}