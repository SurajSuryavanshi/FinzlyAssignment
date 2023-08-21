package Polymorphism;

import javafx.scene.shape.Circle;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter radius of circle : ");
        int radius= sc.nextInt();
        Shape Circle=new circle(radius);

        System.out.println();
        System.out.println("Enter length & width of rectangle");
        int length= sc.nextInt();
        int width=sc.nextInt();

        Shape Rectangle=new Rectangle(length,width);

        System.out.println();
        System.out.println("Enter Sides of Triangle : ");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        Shape Triangle=new Triangle(side1,side2,side3);
        System.out.println("Are of circle is : "+Circle.calculateArea());
        System.out.println("Parameter of circle is : "+Circle.calculatePerimeter());
        System.out.println("Are of Rectangle is : "+Rectangle.calculateArea());
        System.out.println("Parameter of Rectangle is : "+Rectangle.calculatePerimeter());
        System.out.println("Are of Triangle is : "+Triangle.calculateArea());
        System.out.println("Parameter of Triangle is : "+Triangle.calculatePerimeter());
    }
}
