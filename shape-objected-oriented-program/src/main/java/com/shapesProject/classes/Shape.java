package com.shapesProject.classes;

public abstract class Shape {

    private String color;
    private String name;
    private double length;
    private double width;


    public Shape(String name, String color, double length, double width) {
        setName(name);
        setColor(color);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printShapesCall(){
        System.out.println("this is shape class...");
    }

    public abstract double getArea();

    public abstract double getEnvironment();
}
