package org.OOps;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return 3.141 * radius * radius;
    }


}
