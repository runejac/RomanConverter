import java.util.Scanner;

public class RomanConvertion {



    public static String toRoman(int inputDecimal){

        // egen info: Det er out-mappen han sa at vi skulle adde til git-ignore, ellers må man levere arbeidskrav på nytt =)
        // test 2

        StringBuilder inRoman = new StringBuilder();
        int[] decimalNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int j = 0; j < decimalNumbers.length; j++) {

            while (inputDecimal >= decimalNumbers[j]) {
                inputDecimal -= decimalNumbers[j];
                inRoman.append(romanNumerals[j]);
            }
        }
        return inRoman.toString();
    }
}
