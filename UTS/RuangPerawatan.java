import java.util.ArrayList;
import java.util.List;

public class RuangPerawatan {
    private int noRuang;
    private List<KartuPerawatan> daftarKartu = new ArrayList<>();

    public RuangPerawatan(int noRuang) {
        this.noRuang = noRuang;
    }

    public void tambahKartu(KartuPerawatan kartu) {
        daftarKartu.add(kartu);
    }

    public void tampilkanSemua() {
        System.out.println("Ruang " + noRuang +
                " memiliki " + daftarKartu.size() + " kartu perawatan.");
        for (KartuPerawatan k : daftarKartu) {
            k.tampilkanInfo();
        }
    }
}
