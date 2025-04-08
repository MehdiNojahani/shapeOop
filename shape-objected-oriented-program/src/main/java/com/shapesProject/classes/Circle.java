package com.shapesProject.classes;

public class Circle extends Shape{
    private static final double pi=3.14;

    private double r;

    public Circle(String name, String color, double length, double width){
        super(name, color, length, width);
        this.r=length;
        this.r=getWidth();
    }

    @Override
    public void printShapesCall() {
        System.out.println("this is circle class");
    }

    @Override
    public double getArea() {
        return 2*pi*r;
    }

    @Override
    public double getEnvironment() {

        return 2 * pi * Math.pow(r, 2);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }



}
