public class RomanConvertion {

    public static String toRoman(int i){
        String romanNumber = "";
        if (i == 1) {
            romanNumber = "I";
        } else if (i == 2) {
            romanNumber = "II";
        }
        return romanNumber;
    }
}
