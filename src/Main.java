import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner decimalScanner = new Scanner(System.in);

    public static void main(String[] args) throws InputMismatchException {
        UserMenu userMenu = new UserMenu();

            do {

                userMenu.displayMenu();
                int option = userMenu.getOption();

                if (option == 1) {
                    runRomanConverter();

                } else if (option == 0) {

                    decimalScanner.close();
                    userMenu.menuScanner.close();

                    break;
                }
            } while (true);
        System.out.println("Option 0 chosen, exiting...");
    }


    private static void runRomanConverter() throws InputMismatchException {
        try {
            System.out.println("Option 1 chosen, write a number");
            int inputInt =  decimalScanner.nextInt();
            String romanLiteral = RomanConvertion.toRoman(inputInt);
            System.out.printf("The number %d is %s in Roman numerals", inputInt, romanLiteral);
            System.out.println();
        } catch (InputMismatchException i) {
            System.out.println("Need a number, letters are not allowed.");
            decimalScanner.nextLine();
        }
    }
}
