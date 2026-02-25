package blatt18;

public class Summe {

    public static int summe(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return summe(n - 1) +n;
    }

    public static void main(String[] args) {
        System.out.println(summe(3));
    }
}
