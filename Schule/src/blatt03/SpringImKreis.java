package blatt03;
import java.util.Scanner;
public class SpringImKreis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Gebe den Radius deines Kreises ein");
        double radius = input.nextDouble();

        System.out.println("Gebe deine x-Koordinate ein");
        double x = input.nextDouble();
        System.out.println("Gebe deine y-Koordinate ein");
        double y = input.nextDouble();

        if ((x * x) + (y * y) < 1){
            System.out.println("Der Punkt (" + x + "|" + y + ") befindet sich im Einheitskreis!");

        }else if ((y * y) + (x * x) == 1) {
            System.out.println("Der Punkt (" + x + "|" + y + ") befindet sich exakt auf dem Einheitskreis!");
        }

        if (Math.sqrt((x * x) + (y * y)) < radius){
            System.out.println("Der Punkt (" + x + "|" + y + ") befindet sich im Kreis!");
        }else if (Math.sqrt((x * x) + (y * y)) == radius){
            System.out.println("Der Punkt (" + x + "|" + y + ") befindet sich exakt auf dem Kreis!");
        }

    }

}
