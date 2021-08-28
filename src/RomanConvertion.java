public class RomanConvertion {

    public static String toRoman(int i){

        StringBuilder inRoman = new StringBuilder();
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int j = 0; j < numbers.length; j++) {

            while (i >= numbers[j]) {
                i -= numbers[j];
                inRoman.append(romanNumerals[j]);
            }
        }
        return inRoman.toString();
    }
}
