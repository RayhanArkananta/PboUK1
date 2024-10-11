public class SateAyam extends  Makanan{
    public SateAyam(String nama, double harga){
        super(nama);
    }

    @Override
    public void siapkan(){
        System.out.println(getNama() + " sedang dibakar dengan kecap dan bumbu kacang.");
    }
}