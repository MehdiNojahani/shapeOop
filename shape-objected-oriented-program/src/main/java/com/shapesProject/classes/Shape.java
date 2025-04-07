package com.shapesProject.classes;

public class Shape {

    private String color;
    private String name;

    public Shape(double v, String chs, String red){}

    public Shape(String color, String name) {
        setColor(color);
        setName(name);
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
}
