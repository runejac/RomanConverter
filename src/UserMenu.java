import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {

    public final Scanner menuScanner = new Scanner(System.in);

    public int getOption() throws InputMismatchException {
        try {
            System.out.print("Option: ");
            int option = menuScanner.nextInt();
            menuScanner.nextLine();
            return option;
        } catch (InputMismatchException exception) {
            System.out.println("ERROR! _ONLY_ digits are allowed, read the menu options.");
            menuScanner.nextLine();
        }
        return getOption();
    }

    public void displayMenu() {
        System.out.println("_________________________________\n- Menu -\n");
        System.out.println("1 - Write a decimal number to convert it into a Roman numeral");
        System.out.println("0 - Exit");
    }
}
