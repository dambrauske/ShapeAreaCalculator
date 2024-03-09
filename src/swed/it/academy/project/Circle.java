package swed.it.academy.project;

import static swed.it.academy.project.Helper.roundUp;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateArea() {
        double area = getSide1() * getSide1() * Math.PI;
        return roundUp(area);
    }
}
