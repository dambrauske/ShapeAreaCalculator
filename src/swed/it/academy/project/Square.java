package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Shape {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculateArea() {
        double area = this.getSide1() * this.getSide2();
        return new BigDecimal(area).setScale(2, RoundingMode.UP).doubleValue();
    }

}