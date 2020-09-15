package com.codegym;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0d;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
