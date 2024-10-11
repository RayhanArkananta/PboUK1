public class Makanan {
    private String nama;
    private double harga;

    public Makanan(String nama){
        this.nama = nama;
        this.harga = 0;
    }

    public Makanan(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void siapkan(){
        System.out.println(nama + " sedang disiapkan.");
    }

}

