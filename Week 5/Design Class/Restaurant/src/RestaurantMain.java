import java.util.*;
/**
* <h1>Design Class!</h1>
*This program is a Restaurant Simulation
*this program will check the Stock of the food and give the output how much it cost
*U can add the type of food and increase the stock
*If someone order ,just simply type the name of food
* @author Muhammad Zaki
* @version 1.0
* @since 2022-03-13
*/

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama Makanan");
        String namaMakanan = scan.nextLine();
        System.out.println("Masukkan Jumlah makanan");
        Integer Jumlah = scan.nextInt();
        menu.PesanMakanan(namaMakanan,Jumlah);
        scan.close();


        System.out.println("\n===== Stok Terbaru =====");
        menu.tampilMenuMakanan();


    }
}