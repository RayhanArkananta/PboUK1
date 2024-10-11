public class Minuman {
    private String name;
    private double harga;

    public Minuman(String name){
        this.name = name;
        this.harga = 0;
    }

    public Minuman(String name, double harga){
        this.name = name;
        this.harga = harga;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void siapkan(){
        System.out.println(name + "sedang di siapkan");
    }
}
