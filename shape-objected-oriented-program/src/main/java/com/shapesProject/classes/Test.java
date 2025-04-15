package com.shapesProject.classes;

import com.shapesProject.classes.Triangles.IsoscelesTriangle;
import com.shapesProject.classes.Triangles.Triangle;

public class Test {
    public static void main(String[] args) {

        Circle circle1=new Circle("Circle1", "Yellow", 2, 2);
        circle1.printShapesCall();
        System.out.println();
        System.out.println("Circle1 Area = " + circle1.getArea());
        System.out.println("Circle1 Environment = " + circle1.getEnvironment());

        System.out.println();
        System.out.println();

        Triangle triangles=new IsoscelesTriangle("t1", "red", 1, 2, 4);
        triangles.printShapesCall();
        System.out.println("Isosceles triangle = " + triangles.getArea());


        System.out.println();
        System.out.println("---------------------");



        Shape shape=ShapeFactoryClass.shapeCreation("circle");

        if (shape instanceof Circle){
            System.out.println("Circle class");
        }

    }
}
