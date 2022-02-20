import java.util.*;

public class Soal2_w3 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int totalString = 1 ; totalString <= 3 ; totalString++){
            String string = scan.next();
            int number = scan.nextInt();
            System.out.printf("%-15s%03d %n",string,number);   // %-15s digunakan untuk menjustify ke kiri dengan tepat 15 karakter
                                                               // %03d digunakan agar menjadi 3 digit,apabila input kurang dari 3 maka ditambah 0
                                                               // %n digunakan agar langsung kepada input selanjutnya
        }
        System.out.println("================================");
        scan.close();
    }
}
