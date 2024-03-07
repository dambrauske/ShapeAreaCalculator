package swed.it.academy.project;
import java.util.List;

public abstract class Shape {

    private double side1;
    private double side2;
    private double area;
    public Shape(double side1, double side2) {
        this.setSide1(side1);
        this.setSide2(side2);
        this.setArea(this.calculateArea());
    }

    public abstract double calculateArea();

    public void calculateRectangleArea() {
        this.area = this.side1 * this.side2;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
}
