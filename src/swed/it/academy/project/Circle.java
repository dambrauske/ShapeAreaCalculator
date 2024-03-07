package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle  extends Shape {

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateArea() {
        double area = getSide1() * getSide1() * Math.PI;
        return new BigDecimal(area).setScale(2, RoundingMode.UP).doubleValue();
    }
}
