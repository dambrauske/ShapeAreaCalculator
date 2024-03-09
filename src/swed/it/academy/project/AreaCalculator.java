package swed.it.academy.project;

import static swed.it.academy.project.IOManager.*;

public class AreaCalculator {
    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        getInputs();
        if (shapeSelected && inputsProvided) {
            generateOutputs();
            if (repeat()) {
                runCalculator();
            }
        }
        scanner.close();
    }

    private static void getInputs() {
        try {
            ShapeType shape = IOManager.getUserShape();
            if (shape != null) {
                getDataInput();
            }
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void generateOutputs() {
        ShapeType shapeType = IOManager.getShape();

        Shape shape = switch (shapeType) {
            case ShapeType.SQUARE -> new Square(IOManager.getData1());
            case ShapeType.TRIANGLE -> new Triangle(IOManager.getData1(), IOManager.getData2());
            case ShapeType.CIRCLE -> new Circle(IOManager.getData1());
            case ShapeType.HEXAGON -> new Hexagon(IOManager.getData1());
            default -> null;
        };

        if (shape == null) {
            return;
        }
        IOManager.showCalculatedArea(shape.getArea());
    }
}
