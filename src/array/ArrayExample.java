package array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-01.
 */
public class ArrayExample {

    public static void main(String[] args) {
        int [] liczby = {1,2,3};

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(liczby[scanner.nextInt()]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Podałeś wynik poza zakresem");
            } catch (InputMismatchException e) {
                System.out.println("Musisz podać liczbę");
            }
        }
    }
}
