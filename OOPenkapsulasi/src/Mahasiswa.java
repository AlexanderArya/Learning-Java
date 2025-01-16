import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mahasiswa {
    public String Nama;
    public String NIM;
    private String Password;
    private double IPK;
    private double Tagihan;
    private LocalDate tanggal; // Menggunakan LocalDate

    Mahasiswa() {
        this.Nama = "Andrean";
        this.NIM = "672021256";
    }

    // Setter
    public void setTanggal(String tanggal) {
        // Mengonversi String menjadi LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.tanggal = LocalDate.parse(tanggal, formatter);
    }

    public void setPassword(String Pass) {
        this.Password = Pass;
    }

    public void setTagihan(double Tagih) {
        this.Tagihan = Tagih;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    // Getter
    public String getTanggal() {
        // Format ulang LocalDate menjadi String untuk ditampilkan
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return this.tanggal.format(formatter);
    }

    public double getTagihan() {
        return this.Tagihan;
    }

    public String getPassword() {
        return this.Password;
    }

    public double getIPK() {
        return this.IPK;
    }
}
