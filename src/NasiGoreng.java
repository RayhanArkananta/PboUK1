public class NasiGoreng extends Makanan{
    public NasiGoreng(String nama, double harga){
        super(nama);
    }

    @Override
    public void siapkan(){
        System.out.println(getNama() + " sedang di Goreng dengan bumbu khas.");
    }
}