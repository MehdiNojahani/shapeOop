package com.shapesProject.classes.Triangles;

import com.shapesProject.classes.Shape;

public class Triangle extends Shape {

    public Triangle(String name, String color, double length, double width) {
        super(name, color, length, width);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getEnvironment() {
        return 0;
    }

    @Override
    public void printShapesCall() {
        System.out.println("triangle is three types : ");
        //مثلث متساوی الساقین
        System.out.println("Isosceles triangle");
        //مثلث متساوی الاضلاع
        System.out.println("Equilateral triangle");
        //مثلث قایم و الزاویه
        System.out.println("Right triangle");
    }

    public Triangle() {

    }
}
