package com.shapesProject.classes;

import com.shapesProject.classes.Triangles.Triangle;

public class ShapeFactoryClass {

    public static Shape shapeCreation(String shapeTypes){

        if (shapeTypes.trim().equals("circle"))

            return new Circle();

        else if (shapeTypes.trim().equals("triangle"))
            return new Triangle();

        else
            return null;
    }

}
