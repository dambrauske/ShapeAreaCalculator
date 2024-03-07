package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public double calculateArea() {
        double area = this.getSide1() * this.getSide2() / 2;
        return new BigDecimal(area).setScale(2, RoundingMode.UP).doubleValue();
    }
}
