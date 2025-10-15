public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, Pemilik pemilik, String ras) {
        super(nama, umur, pemilik);
        this.ras = ras;
    }

    public String suara() {
        return "Meong~";
    }
    
    public void info(String tambahan) {
        System.out.println("Kucing " + getNama() + " (" + ras + ") - " + tambahan);
    }

    public void info() {
        System.out.println("Kucing bernama " + getNama() + 
                " berumur " + getUmur() + " tahun, ras " + ras);
    }
}
