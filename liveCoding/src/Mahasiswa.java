import java.time.LocalDate;
import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String jenis_kelamin;
    public String tanggalInput;
    public String Penjurusan;

    Scanner Input_mahasiswa = new Scanner(System.in);

    public void tanya() {
        System.out.print("Masukan nama anda:");
        nama = Input_mahasiswa.nextLine();
        System.out.print("Masukan NIM anda :");
        nim = Input_mahasiswa.nextLine();
        System.out.print("Jenis kelamin anda: PRIA/WANITA?");
        jenis_kelamin = Input_mahasiswa.nextLine();

    }

    public void get_nama() {
        System.out.print(nama);
    }

    public void get_penjurusan() {
        String penjurusan = nim.substring(6, 9);
        int convertToInt = Integer.parseInt(penjurusan);
        if (convertToInt < 135) {
            penjurusan = "Software Enginnering";
        } else if (convertToInt < 204) {
            penjurusan = "Networking";
        } else if (convertToInt < 315) {
            penjurusan = "Data Science";
        } else {
            penjurusan = "None";
        }
        System.out.print(penjurusan);
    }

    public void getTanggal() {
        LocalDate today = LocalDate.now();
        System.out.print(today);
    }

    public void get_nim() {
        System.out.println(nim);
    }

    public void get_angkatan() {
        String a = nim.substring(2, 6);
        System.out.println(a);
    }

    public void get_prodi() {
        String b = nim.substring(0, 2);
        if (b.equals("67"))
            System.out.println("TEKNIK INFORMATIKA");
        else if (b.equals("68"))
            System.out.println("SISTEM INFORMASI");
        else if (b.equals("69"))
            System.out.println("DKV");
    }

    public void Jenis_Kelamin() {
        if (jenis_kelamin.equals("PRIA")) {
            System.out.print("Mahasiswa");
        } else if (jenis_kelamin.equals("WANITA")) {
            System.out.print("Mahasiswi");
        } else {
            System.out.print("DATA INPUTAN SALAH");
        }
    }
}
