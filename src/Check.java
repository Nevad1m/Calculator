import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check  {
    public static boolean checkNumb (String firstNumb, String secondNumb) throws IOException {
        List<String> arab = new ArrayList<>(10);
        arab.add("1");
        arab.add("2");
        arab.add("3");
        arab.add("4");
        arab.add("5");
        arab.add("6");
        arab.add("7");
        arab.add("8");
        arab.add("9");
        arab.add("10");
        List<String> rim = new ArrayList<>(10);
        rim.add("I");
        rim.add("II");
        rim.add("III");
        rim.add("IV");
        rim.add("V");
        rim.add("VI");
        rim.add("VII");
        rim.add("VIII");
        rim.add("IX");
        rim.add("X");
        if (arab.contains(firstNumb) && arab.contains(secondNumb) || rim.contains(firstNumb) && rim.contains(secondNumb)) {
            return true;
        } else {
            throw new IOException("Некорректное выражение.");
        }
    }

        public static boolean checkSign (String sign) throws IOException {
            List<String> signs = new ArrayList<>(4);
            signs.add("+");
            signs.add("-");
            signs.add("/");
            signs.add("*");
            if (signs.contains(sign)) {
                return true;
            } else {
                throw new IOException("Некорректное выражение.");
            }
        }
}
