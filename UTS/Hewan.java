public class Hewan {
    private String nama;
    private int umur;
    private Pemilik pemilik;

    public Hewan(String nama, int umur, Pemilik pemilik) {
        this.nama = nama;
        this.umur = umur;
        this.pemilik = pemilik;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public Pemilik getPemilik() {
        return pemilik;
    }

    public String suara() {
        return "(suara hewan tidak diketahui)";
    }

    public void info() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }
}

