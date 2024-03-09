package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Helper {

    public static double roundUp(double num) {
        return new BigDecimal(num).setScale(2, RoundingMode.UP).doubleValue();
    }
}
