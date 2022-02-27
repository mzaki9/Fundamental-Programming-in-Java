/**
* <h1>Inventory!</h1>
* This program makes new "object" in inventory that calls barang ,and we can edit the stok of barang
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Muhammad Zaki
* @version 1.0
* @since 2022-02-27
*/


public class Inventori {
    Barang[] barangs;

    void initBarang(){                              //module that initialize Barang,or create Barang
        barangs = new Barang[2];
        barangs[0] = new Barang("001","Baju",10);
        barangs[1] = new Barang("002", "Celana",20);
    }

    void showBarang(){
        System.out.println(barangs[0].nama_barang + "("+barangs[0].getStok()+")");
        System.out.println(barangs[1].nama_barang + "("+barangs[1].getStok()+")");
    }

    void pengadaan(){                               // module that can modify the stock of Barang
        initBarang();

        //bisa menggunakan cara seperti ini dengan menggunakan modul tambahan
        barangs[0].setStok(barangs[0].addStok(20));

        //cara ini bisa dilakukan, tapi operator selain (+), juga bisa dipakai
        barangs[1].setStok(barangs[0].getStok()+20);
        showBarang();
    }

    public static void main(String[] args){
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
