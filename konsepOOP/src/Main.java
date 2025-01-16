import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner InputAngka = new Scanner(System.in);

        Kalkulator kalkulator = new Kalkulator();

        System.out.print("Masukan angka pertama:");
        kalkulator.angka1 = InputAngka.nextInt();
        System.out.print("Masukan angka kedua:");
        kalkulator.angka2 = InputAngka.nextInt();

        //VOID
        kalkulator.tambah();
        kalkulator.kurang();

        //NON-VOID
        System.out.println("Ini adalah hasil kali :" + kalkulator.kali());
        System.out.println("Ini adalah hasil bagi :" + kalkulator.bagi());

        System.out.println("Hasil pangkat :" + kalkulator.pangkat(4,2));
    }
}