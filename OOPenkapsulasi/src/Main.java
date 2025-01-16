public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();

        m1.setTagihan(10000);
        m1.setPassword("672021256");
        m1.setIPK(3.9);
        m1.setTanggal("07-01-2025");

        System.out.println("Nama anda: " + m1.Nama);
        System.out.println("NIM anda: " + m1.NIM);
        System.out.println("Tagiahan anda: " + m1.getTagihan());
        System.out.println("Password anda: " + m1.getPassword());
        System.out.println("IPK anda: " + m1.getIPK());
        System.out.println("Tanggal: " + m1.getTanggal());

    }
}