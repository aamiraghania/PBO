public class Main {
    public static void main(String[] args) {
        Pemilik p1 = new Pemilik("Aamira", "08123456789");

        Kucing kucing1 = new Kucing("Mimi", 2, p1, "Persia");
        Anjing anjing1 = new Anjing("Bobby", 3, p1, "Sedang");

        KartuPerawatan kartu1 = new KartuPerawatan(101, kucing1);
        KartuPerawatan kartu2 = new KartuPerawatan(102, anjing1);

        RuangPerawatan ruang1 = new RuangPerawatan(1);
        ruang1.tambahKartu(kartu1);
        ruang1.tambahKartu(kartu2);

        Hewan[] daftar = { kucing1, anjing1 };
        for (Hewan h : daftar) {
            System.out.println(h.getNama() + " bersuara: " + h.suara());
            h.info();
        }

        kucing1.info("Sudah divaksin lengkap");

        ruang1.tampilkanSemua();
    }
}