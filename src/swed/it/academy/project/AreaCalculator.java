package swed.it.academy.project;

import static swed.it.academy.project.IOManager.*;

public class AreaCalculator  {

    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        getInputs();
        generateOutputs();
    }
    private static void getInputs() {
        try {
            int shape = getUserShape();
            if (shape == 1 || shape == 2 || shape == 3) {
                getDataInput();
            }
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void generateOutputs() {
        int option = getShape();

        switch (option) {
            case 1:
        }

        Shape shape = switch (option) {
            case 1 -> new Square(getData1());
            case 2 -> new Triangle(getData1(), getData2());
            case 3 -> new Circle(getData1());
            default -> null;
        };

        if (shape == null) {
           return;
        }
        showCalculatedArea(shape.getArea());
    }



}
