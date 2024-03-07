package swed.it.academy.project;

import java.util.Scanner;

public class InputOutputManager {

    private static int shape;
    private static double data1;
    private static double data2;

    public static int getShape() {
        return shape;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }
    static final Scanner scanner = new Scanner(System.in);

    static void userShape() {
        System.out.println("Please enter number representing a shape:");
        System.out.println("1 for square, 2 for triangle, 3 for circle.");
        shape = scanner.nextInt();
    }

    static void showCalculatedArea(String shapeArea) {
        System.out.println("The area of your shape is " + shapeArea);
    }

    static void dataInput(int shape) {
        try {
            switch (shape) {
                case 1:
                    System.out.println("Please enter side length");
                    data1 = scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("Please enter one sides length");
                    data1 = scanner.nextDouble();
                    System.out.println("Please enter another sides length");
                    data2 = scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Please enter radius");
                    data1 = scanner.nextDouble();
                    break;
                default:
                    throw new UnknownShapeException("The shape is invalid");
            }
        }
        catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

}
