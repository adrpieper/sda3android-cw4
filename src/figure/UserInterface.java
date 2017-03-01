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
        Figure figure = null;
        switch (i) {
            case 1:
                System.out.println("Podaj bok");
                double a = scanner.nextDouble();
                figure = new Square(a);
                break;
            case 2:
                System.out.println("Podaj promień");
                double r = scanner.nextDouble();
                figure = new Circle(r);
                break;
        }
        System.out.println("Pole: " + figure.countArea());
        System.out.println("Obwód: " + figure.countCircumference());
    }
}
