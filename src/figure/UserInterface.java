package figure;

import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-01.
 */
public class UserInterface {

    public static void main(String[] args) {
        System.out.println("Wybierz figurę:");
        System.out.println("1 - kwadrat");
        System.out.println("2 - koło");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Podaj bok");
                double a = scanner.nextDouble();
                Square square = new Square(a);
                System.out.println("Pole: " + square.countArea());
                System.out.println("Obwód: " + square.countCircumference());
                break;
            case 2:
                System.out.println("Podaj promień");
                double r = scanner.nextDouble();
                Circle circle = new Circle(r);
                System.out.println("Pole: " + circle.countArea());
                System.out.println("Obwód: " + circle.countCircumference());
                break;
        }
    }
}
