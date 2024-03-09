package swed.it.academy.project;

import static swed.it.academy.project.Helper.roundUp;

public class Triangle extends Shape {
    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public double calculateArea() {
        double area = this.getSide1() * this.getSide2() / 2;
        return roundUp(area);
    }
}
