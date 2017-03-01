package figure;

import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-01.
 */
public class UserInterface {
    static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Wybierz figurę:");
        System.out.println("1 - kwadrat");
        System.out.println("2 - koło");
        scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Figure figure = null;
        switch (i) {
            case 1:
                figure = new Square(nextDouble("bok"));
                break;
            case 2:
                figure = new Circle(nextDouble("promien"));
                break;
        }
        System.out.println("Pole: " + figure.countArea());
        System.out.println("Obwód: " + figure.countCircumference());
    }

    static double nextDouble(String pameterName) {
        System.out.println("Podaj " + pameterName);
        return scanner.nextDouble();
    }
}
