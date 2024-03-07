package swed.it.academy.project;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(5.5);
        System.out.println("Square:" + square1.getArea());

        Triangle triangle1 = new Triangle(7, 9);
        System.out.println("Triangle:" + triangle1.getArea());    }
}
