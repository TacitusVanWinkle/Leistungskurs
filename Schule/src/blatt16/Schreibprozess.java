package blatt16;
import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;

public class Schreibprozess {
    public static void main(String[] args) {

        File f = new File("io");
        if (f.exists() != true) {
            f.mkdir();
        }

        try {
            File f1 = new File("io/Test01.txt");
            FileWriter fw = new FileWriter(f1);
            fw.write("What does this job pay? \n");
            fw.write("How do you feel about war? \n");
            fw.write("War never changes. \n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            File f2 = new File("io/Test02.html");
            FileWriter fw = new FileWriter(f2);
            fw.write("<!DOCTYPE html> \n");
            fw.write("<html> \n");
            fw.write("<head> \n");
            fw.write("<title> HTML aus Java </title>");
            fw.write("</head> \n");
            fw.write("<body> \n");
            fw.write("<h1> HTML aus Java? </h1> \n");
            fw.write("<p> Es geht. Wikrlich. </p> \n");
            fw.write("</body> \n");
            fw.write("</html>");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        File f3 = new File("io/img");
        if (f3.exists() != true) {
            f3.mkdir();


        }

        File f4 = new File("io/css");
        if (f4.exists() != true) {
            f4.mkdir();
        }
    }
}