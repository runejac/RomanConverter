import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {

    final Scanner menuScanner = new Scanner(System.in);

    public int getOption() throws InputMismatchException {
        System.out.print("Option: ");
        int option = menuScanner.nextInt();
        menuScanner.nextLine();
        return option;
    }

    public void displayMenu() {
        System.out.println("_________________________________\n- Menu -\n");
        System.out.println("1 - Write a decimal number to convert it into a Roman numeral");
        System.out.println("0 - Exit");
    }
}
