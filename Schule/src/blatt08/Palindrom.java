package blatt08;

public class Palindrom {

    public static String umdrehen(String text) {
        String neu = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            neu += text.charAt(i);
        }
        return neu;
    }

    public static boolean istPalindrom(String text) {
        String umgedreht = umdrehen(text);
        return umgedreht.equals(text);
    }



    public static void main(String[] args) {

        //Test:
        System.out.println(umdrehen("girafarig"));
        System.out.println(istPalindrom("girafarig"));

    }

}