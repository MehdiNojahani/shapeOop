package com.shapesProject.classes.Triangles;

public class IsoscelesTriangle extends Triangle {

    private double p;

    public IsoscelesTriangle(String name, String color, double length, double width, double p) {
        super(name, color, length, width);
        setP(p);
    }

    @Override
    public double getArea() {
        return (getLength() + getWidth()) * (2*getP());    }

    @Override
    public void printShapesCall() {
        System.out.println("this Isosceles triangle class...");
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }
}
