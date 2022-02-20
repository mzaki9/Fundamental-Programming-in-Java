import java.util.*;

public class Soal4_w3 {
    public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    int jumlah_penjualan = scan.nextInt();
    scan.close();
    int gaji;
    if (jumlah_penjualan >= 80){
         gaji = 50000* jumlah_penjualan * 135/100 + 500000;
    }
    else if (jumlah_penjualan >= 40){
        gaji = 50000*jumlah_penjualan * 125/100 + 500000;
    }
    else if (jumlah_penjualan < 15){
        gaji = 500000 -  ((15-jumlah_penjualan) * 50000 * 15/100) ;
    }
    else gaji = 500000 + jumlah_penjualan*50000*10/100;
    
    System.out.println(gaji);
    }
}
