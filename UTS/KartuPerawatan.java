public class KartuPerawatan {
    private int idKartu;
    private Hewan hewan; 

    public KartuPerawatan(int idKartu, Hewan hewan) {
        this.idKartu = idKartu;
        this.hewan = hewan;
    }

    public void tampilkanInfo() {
        System.out.println("Kartu #" + idKartu + " untuk " + hewan.getNama());
    }

    public Hewan getHewan() {
        return hewan;
    }
}
