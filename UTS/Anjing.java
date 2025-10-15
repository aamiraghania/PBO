public class Anjing extends Hewan {
    private String ukuran;

    public Anjing(String nama, int umur, Pemilik pemilik, String ukuran) {
        super(nama, umur, pemilik);
        this.ukuran = ukuran;
    }

    public String suara() {
        return "Guk guk!";
    }

    public void info() {
        System.out.println("Anjing bernama " + getNama() + 
                " berukuran " + ukuran + " dan berumur " + getUmur() + " tahun");
    }
}

