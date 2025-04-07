package com.shapesProject.classes;

public class Circle extends Shape{
    private static final double pi=3.14;

    private double r;

    public Circle(double r, String color, String name){
        super(color, name);
        this.r=r;
    }

    @Override
    public void printShapesCall() {
        System.out.println("this is circle class");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){

        setR(3);
        return (2 * pi) * getR();
    }
}
