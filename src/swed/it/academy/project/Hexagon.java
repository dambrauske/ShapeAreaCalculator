package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon extends Shape {
    public Hexagon(double side1) {
        super(side1, side1);
    }

    @Override
    public double calculateArea() {
        double area = (3 * Math. sqrt(3) * this.getSide1() * this.getSide1()) / 2;
        return new BigDecimal(area).setScale(2, RoundingMode.UP).doubleValue();
    }
}
