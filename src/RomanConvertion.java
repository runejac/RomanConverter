public class RomanConvertion {

    public static String toRoman(int i){

        StringBuilder inRoman = new StringBuilder();
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] romanNumerals = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        if (i <= 100) {

            for (int j = 0; j < numbers.length; j++) {

                while (i >= numbers[j]) {
                    i -= numbers[j];
                    inRoman.append(romanNumerals[j]);
                }
            }
        }
        return inRoman.toString();
    }
}
