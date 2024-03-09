package swed.it.academy.project;

import static swed.it.academy.project.Helper.roundUp;

public class Square extends Shape {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculateArea() {
        double area = this.getSide1() * this.getSide2();
        return roundUp(area);
    }

}