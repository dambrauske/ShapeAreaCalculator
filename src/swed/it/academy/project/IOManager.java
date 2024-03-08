package swed.it.academy.project;

import java.util.Arrays;
import java.util.Scanner;

public class IOManager {

    private static ShapeType shape;
    private static double data1;
    private static double data2;

    public static ShapeType getShape() {
        return shape;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }

    static final Scanner scanner = new Scanner(System.in);

    static void repeat() {
        System.out.println("Do you want to try again? Enter y/n");
        scanner.nextLine();
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("y")) {
            getUserShape();
        } else if (answer.equals("n")) {
            System.out.println("Calculator is off");
        }
    }

    static boolean validateShapeInput(ShapeType shape) {
        ShapeType[] allowedShapes = {ShapeType.SQUARE, ShapeType.TRIANGLE, ShapeType.CIRCLE};

        return Arrays.stream(allowedShapes).anyMatch(allowedShape -> allowedShape == shape);
    }

    static ShapeType getUserShape() {
        System.out.println("Please enter number representing a shape:");
        System.out.println("1 for square, 2 for triangle, 3 for circle.");

        try {
            if (!scanner.hasNextInt()) {
                throw new UnknownShapeException("Invalid input.");
            }

            ShapeType[] shapeTypes = ShapeType.values();
            int userInputValue = scanner.nextInt();

            if (userInputValue < 1 || userInputValue > shapeTypes.length) {
                throw new UnknownShapeException("Invalid input.");
            }

            ShapeType input = Arrays.stream(ShapeType.values()).filter(shapeType -> shapeType.ordinal() == userInputValue).findFirst().orElse(ShapeType.UNKNOWN);
            if (validateShapeInput(input)) {
                shape = input;
            } else {
                throw new UnknownShapeException("Invalid input.");
            }

        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
            repeat();
        }
        return shape;
    }

    static void showCalculatedArea(double shapeArea) {
        if (shapeArea == (int) shapeArea) {
            System.out.println("The area of your shape is " + (int) shapeArea + " cm.");
        } else {
            System.out.println("The area of your shape is " + shapeArea + " cm.");
        }
    }


    static void getDataInput() throws UnknownShapeException {
        try {
            switch (shape) {
                case ShapeType.SQUARE:
                    System.out.println("Please enter side length in cm");
                    data1 = scanner.nextDouble();
                    break;
                case ShapeType.TRIANGLE:
                    System.out.println("Please enter the base of a triangle in cm");
                    data1 = scanner.nextDouble();
                    System.out.println("Please enter the height of triangle in cm");
                    data2 = scanner.nextDouble();
                    break;
                case ShapeType.CIRCLE:
                    System.out.println("Please enter radius in cm");
                    data1 = scanner.nextDouble();
                    break;
                default:
                    throw new UnknownShapeException("The shape is invalid");
            }
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
            repeat();
        }
    }

}
