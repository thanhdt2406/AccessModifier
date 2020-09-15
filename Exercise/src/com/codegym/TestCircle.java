package com.codegym;

public class TestCircle {

    public static void main(String[] args) {
	    Circle c1 = new Circle();
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

        Circle c2 = new Circle(5.4);
        System.out.println(c2.getColor());
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());

        c1.setColor("yellow");
        c2.setRadius(1.2);

        System.out.println(c1.getColor());
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
    }
}
