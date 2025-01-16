public class Main {
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa();

        // INPUT_USER
        Mahasiswa1.tanya();
        System.out.println("\n\n\n\n\n");

        // OUTPUT_VOID_METHOD
        System.out.print("Selamat datang ");
        Mahasiswa1.get_nama();
        System.out.print(", ");
        Mahasiswa1.get_nim();
        Mahasiswa1.Jenis_Kelamin();
        System.out.print(" angkatan ");
        Mahasiswa1.get_angkatan();
        System.out.print("Program Studi ");
        Mahasiswa1.get_prodi();
        System.out.print("Penjurusan ");
        Mahasiswa1.get_penjurusan();
        System.out.print("\n\n\n Tanggal Form Diambil :");
        Mahasiswa1.getTanggal();

    }
}