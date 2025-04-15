package com.shapesProject.classes;


//Circle class inherit Shape class
public class Circle extends Shape{
    private static final double pi=3.14;


    //r is a Radius of courage
    private double r;


    public Circle(){
        super();
    }

    public Circle(String c) {
        super();
        System.out.println("this is circle class " + c);
    }

    //class constructor
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
        return 2*pi*getR();
    }


    //implement parent class abstract method
    @Override
    public double getEnvironment() {

        return 2 * pi * Math.pow(getR(), 2);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }



}
