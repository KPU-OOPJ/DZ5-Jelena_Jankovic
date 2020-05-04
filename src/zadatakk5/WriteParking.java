
package zadatakk5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteParking {
    
       public static void main(String[] args) throws IOException {

        Parking parking = new Parking(50);

        parking.uveziNaParking("BG 123-456");
        parking.uveziNaParking("NS 234-56");
        FileWriter f = new FileWriter("parking.txt");
        PrintWriter printWriter = new PrintWriter(f);
        printWriter.print(parking.ispisiSve());
        printWriter.print(parking.ispisiBeogradjane());
        System.out.println(parking.ispisiSve());
        System.out.println(parking.ispisiBeogradjane());
        printWriter.close();
    }
}
