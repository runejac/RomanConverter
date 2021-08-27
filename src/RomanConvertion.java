public class RomanConvertion {

    public static String toRoman(int i){
        String romanNumber = "";

        String[] oners = {"I", "II", "III"};
        String[] fourToThen = {"IV", "V", "VI", "VII", "VIII", "IX", "X"};



        if (i >= 4 && i <= 10) {
            for (int j = 0; j < fourToThen.length; j++) {
                romanNumber = fourToThen[i-4];
            }
        }
        if (i <= 3) {
            for (int j = 0; j < oners.length; j++) {
                romanNumber = oners[i-1];
            }
        }
        return romanNumber;
    }
}
