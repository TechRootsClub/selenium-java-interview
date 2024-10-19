package programs;

public class Program1 {
    public static void main(String[] args) {
        String strInput = "Welcome to TechRoots Club for Learning";
        String[] strArr = strInput.split(" "); // [Welcome, to, TechRoots, Club, for, Learning]
        String strOutput = "";
        for (String str : strArr) {
            for (int i = str.length() - 1; i >= 0; i--) {
                strOutput += str.charAt(i);
            }
            strOutput += " ";
        }

        System.out.println(strOutput); //emocleW ot stooRhceT bulC rof gninraeL
    }
}

