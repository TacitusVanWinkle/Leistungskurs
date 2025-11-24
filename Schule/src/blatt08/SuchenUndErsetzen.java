package blatt08;

public class SuchenUndErsetzen {

    public static String ersetzen (String text, char a, char b) {
        String neu = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == a) {
                neu += b;
            } else {
                neu += text.charAt(i);
            }
        }
        return neu;
    }



    public static void main(String[] args) {

        System.out.println(ersetzen("Nunja Sex Party", 'u', 'i' ));

    }

}
