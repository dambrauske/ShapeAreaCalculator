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
            ShapeType shape = getUserShape();
            if (validateShapeInput(shape)) {
                getDataInput();
            }
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void generateOutputs() {
        ShapeType shapeType = getShape();

        Shape shape = switch (shapeType) {
            case ShapeType.SQUARE -> new Square(getData1());
            case ShapeType.TRIANGLE -> new Triangle(getData1(), getData2());
            case ShapeType.CIRCLE -> new Circle(getData1());
            default -> null;
        };

        if (shape == null) {
           return;
        }
        showCalculatedArea(shape.getArea());
    }



}
