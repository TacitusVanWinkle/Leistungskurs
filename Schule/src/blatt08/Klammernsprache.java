package blatt08;

public class Klammernsprache {

    public static boolean istKlammerwort(String text) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                count++;
            } else if (text.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        if (count == 0) {
            return true;
        } else  {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(istKlammerwort("()()()()()()()((()))")); //true
        System.out.println(istKlammerwort("()))(("));   //false

    }

}
