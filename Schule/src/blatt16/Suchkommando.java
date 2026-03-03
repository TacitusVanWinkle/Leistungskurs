package blatt16;
import com.sun.jdi.StringReference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class Suchkommando {

    public static void suchen(String dateiname, String dateiendung, String pfad) {
        File f =  new File(pfad);
        File s;
        System.out.println(pfad);
        if (!f.isFile()){
            String[] arr =  f.list();
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    s = new File(pfad + "/" + arr[i]);
                    if (s.isFile()) {
                        if (s.getName().equals(dateiname + dateiendung)) {
                            // gesuchte Datei?
                            System.out.println(s.getPath());
                            System.exit(0);
                        }

                    } else {
                        suchen(dateiname, dateiendung, pfad + "/" + arr[i] + "/");
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        suchen("cod", ".exe", "C:/");
        System.out.println("Es konnte keine Datei mit diesem Namen gefunden werden.");
    }
}
