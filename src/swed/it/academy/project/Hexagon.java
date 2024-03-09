package swed.it.academy.project;

import static swed.it.academy.project.Helper.roundUp;

public class Hexagon extends Shape {
    public Hexagon(double side1) {
        super(side1, side1);
    }

    @Override
    public double calculateArea() {
        double area = (3 * Math.sqrt(3) * this.getSide1() * this.getSide1()) / 2;
        return roundUp(area);
    }
}
