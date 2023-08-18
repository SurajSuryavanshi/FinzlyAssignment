package Abstrastions;

 interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;

    }
    public double calculatePerimeter(){
        return 2*3.14*radius;
    }

}
class Triangle implements Shape{
    double A;
    double B;
    double C;
    public Triangle(double A,double B,double C){
        this.A=A;
        this.B=B;
        this.C=C;

    }

    @Override
    public double calculateArea() {
        return 0.5*A*B;
    }
    public double calculatePerimeter(){
        return A*B*C;
    }
}

class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }
}

public class Main {
    public static void main(String[] args){
        Circle c=new Circle(9);
        System.out.println("The Area of Circle is : "+c.calculateArea());
        System.out.println("The ");
        Rectangle r=new Rectangle(6,8);
        Triangle T=new Triangle(6,5,4);


    }
}