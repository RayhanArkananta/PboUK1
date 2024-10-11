public class EsTeh extends Minuman {
    public EsTeh(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public  void siapkan(){
        System.out.println(getName() + " sedang di sajikan dengan Es Batu");
    }
}
