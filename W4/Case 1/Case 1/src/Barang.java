public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;   //private used for capsulation a variabel

    public Barang(String kode,String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        setStok(stk);
    }

    public int addStok(int stok){   //modul untuk menambahkan 
        stok += stok;
        return stok;
    }

    public int getStok() {  //this is called accesor
        return stok;
    }

    public void setStok(int stok) {     //this is called mutator
        this.stok = stok;
    }
}
