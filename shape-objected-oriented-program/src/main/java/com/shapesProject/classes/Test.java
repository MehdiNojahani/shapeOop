package com.shapesProject.classes;

public class Test {
    public static void main(String[] args) {

        Circle circle1=new Circle("Circle1", "Yellow", 2, 2);
        circle1.printShapesCall();
        System.out.println();
        System.out.println("Circle1 Area = " + circle1.getArea());
        System.out.println("Circle1 Environment = " + circle1.getEnvironment());
    }
}
