//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Makanan nasiGoreng = new NasiGoreng("Nasi Goreng Special", 20000);
        Makanan sateAyam = new SateAyam("Sate Ayam Madura", 15000);
        Minuman esTeh = new EsTeh("ES Teh Manis", 5000);

        nasiGoreng.siapkan();
        sateAyam.siapkan();
        esTeh.siapkan();

        nasiGoreng.setHarga(20000);
        sateAyam.setHarga(15000);
        System.out.println(nasiGoreng.getNama() + " sekarang seharga Rp" + nasiGoreng.getHarga());

        cetakInfoMakanan(nasiGoreng);
        cetakInfoMakanan(sateAyam, "Menu Favorit");
    }


    public static void cetakInfoMakanan(Makanan makanan) {
        System.out.println(makanan.getNama() + " seharga Rp" + makanan.getHarga());
    }

    public static void cetakInfoMakanan(Makanan makanan, String deskripsi) {
        System.out.println(makanan.getNama() + " adalah " + deskripsi + " dan seharga Rp" + makanan.getHarga());
    }
}
