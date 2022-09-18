import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:  ");
        String s = sc.nextLine();
        String[] elements = s.split(" ");
        if (elements.length > 3) {
            throw new IOException("Некорректное выражение.");
        }
        Check.checkNumb(elements[0], elements[2]);
        Check.checkSign(elements[1]);
        String[] sArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int key = Arrays.binarySearch(sArab, elements[0]);
        if (key >= -2) {;
            System.out.println(calc(s));
        } else {
            String arabFromRim = Converter.convertRimToArab(s);
            int resultArab = Integer.parseInt(calc(arabFromRim));
            if (resultArab < 1) {
                throw new IOException("Некорректное выражение.");
            }
            String resultRim = Converter.convertArabToRim(resultArab);
            System.out.println(resultRim);
        }
    }

    public static String calc(String input) throws IOException {
        String[] elements = input.split(" ");
        String firstNumb = elements[0];
        String secondNumb = elements[2];
        String operand = elements[1];

        if (operand.equals("+")) {
            int result = Integer.parseInt(firstNumb) + Integer.parseInt(secondNumb);
            return String.valueOf(result);
        } else if (operand.equals("-")) {
            int result = Integer.parseInt(firstNumb) - Integer.parseInt(secondNumb);
            return String.valueOf(result);
        } else if (operand.equals("*")) {
            int result = Integer.parseInt(firstNumb) * Integer.parseInt(secondNumb);
            return String.valueOf(result);
        } else if (operand.equals("/")) {
            int result = Integer.parseInt(firstNumb) / Integer.parseInt(secondNumb);
            return String.valueOf(result);
        }
        throw new IOException("Некорректное выражение.");
    }
}
