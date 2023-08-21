package Polymorphism;

class circle implements Shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.14*radius;
    }
}
