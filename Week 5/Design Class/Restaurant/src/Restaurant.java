public class Restaurant {

    public static byte id = 0;
    private Makanan[] Menu;

    // Accesor & mutator
    public Makanan[] getMenu() {
        return this.Menu;
    }

    public void setMenu(Makanan[] Menu) {
        this.Menu = Menu;
    }

    // Constructor
    public Restaurant() {
        this.Menu = new Makanan[10];
        for (int i = 0; i < 10; i++) {
            this.Menu[i] = new Makanan();
        }
    }

    // Method
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.Menu[id].setNama_makanan(nama);
        this.Menu[id].setHarga_makanan(harga);
        this.Menu[id].setStok(stok);
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(this.Menu[i].getNama_makanan() + "[" + this.Menu[i].getStok() + "]" + "\tRp. "
                        + this.Menu[i].getHarga_makanan());
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (this.Menu[id].getStok() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void nextId() {
        id++;
    }

    public void PesanMakanan(String namaMakanan, Integer Jumlah) {

        System.out.println("===== Pesanan Anda ====\n");
        System.out.println("Anda Memesan  : " + namaMakanan + " \nDengan Jumlah : " +Jumlah);
        System.out.println("Total Harga   : Rp. " + totalHarga(namaMakanan, Jumlah));
        UpdateStok(namaMakanan, Jumlah);
    }

    public void UpdateStok(String Nama,int jumlah){
        int newStok = 0;
        for (int idx = 0 ; idx < 10 ; idx++){
            if (this.Menu[idx].getNama_makanan().equals(Nama)){
                if(!isOutOfStock(idx)){
                    newStok = this.Menu[idx].getStok() - jumlah;
                    this.Menu[idx].setStok(newStok);
                }
                else{
                    System.out.println("\nMohon Maaf Stok Habis!");
                }
            }
        }
    }

    public double totalHarga(String namaMakanan,Integer Jumlah){
        double harga = 0;
        for (int idx = 0 ; idx < 10 ; idx++){
            if (this.Menu[idx].getNama_makanan().equals(namaMakanan)){
                harga = this.Menu[idx].getHarga_makanan()*Jumlah;
            }
        }   
        return harga;  
    }
}