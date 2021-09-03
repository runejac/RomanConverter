import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to convert it to Roman literals:");
        int inputInt =  sc.nextInt();
        sc.close();
        String romanLiteral = RomanConvertion.toRoman(inputInt);
        System.out.printf("The number %d is %s in Roman number", inputInt, romanLiteral);
    }
}
