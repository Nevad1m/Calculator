public class Converter {
    public static String convertRimToArab(String s) {
        String[] rimElements = s.split(" ");
        RimNumb rimNumb1 = RimNumb.valueOf(rimElements[0]);
        RimNumb rimNumb2 = RimNumb.valueOf(rimElements[2]);
        String arabNumb1 = rimNumb1.getConvert();
        String arabNumb2 = rimNumb2.getConvert();
        String arabNumbers = arabNumb1 + " " + rimElements[1] + " " + arabNumb2;
        return arabNumbers;
    }
    public static String convertArabToRim(int n) {
        RimNumb[] rim = RimNumb.values();
        String a = String.valueOf(rim[n - 1]);
        return a;
    }
}
