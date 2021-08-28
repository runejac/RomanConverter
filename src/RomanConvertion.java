public class RomanConvertion {

    public static String toRoman(int i){

        String romanNumber = "";

        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        if (i >= 0 && i <= 10) {
            for (int j = 0; j < romanNumerals.length; j++) {
                romanNumber = romanNumerals[i-1];
            }
        }
        return romanNumber;
    }
}
