import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner inputBanyak = new Scanner(System.in);
        Scanner inputData = new Scanner(System.in);
        Binatang binatang = new Binatang();
        Kucing meong = new Kucing();
        Anjing guguk = new Anjing();

        System.out.print("Masukan Jumlah Binatang: ");
        int jmlh = inputBanyak.nextInt();

        String[] kb = new String[jmlh];
        String[] nama = new String[jmlh];
        String[] pemilik = new String[jmlh];
        String[] usia = new String[jmlh];
        String[] berat = new String[jmlh];
        String[] kecepatan = new String[jmlh];
        String kodeKodean;

        String[] kode1 = new String[jmlh];
        String[] nama1 = new String[jmlh];
        String[] pemilik1 = new String[jmlh];
        String[] usia1 = new String[jmlh];
        String[] berat1 = new String[jmlh];
        String[] kecepatan1 = new String[jmlh];


        for(int i=0; i<jmlh;i++){

            //Menu
            System.out.println("Pilih Binatang: ");
            System.out.println("1. Kucing ");
            System.out.println("2. Anjing ");
            System.out.print("Masukan Pilihan :");

            //Pemilihan Hewan
            int pilih;
            pilih = inputBanyak.nextInt();
            if(pilih == 1){

            //Kucing

                //Kode
                System.out.print("Masukan Kode: ");
                kb[i] = inputData.nextLine();
                binatang.setKodeBintang(kb[i]);

                //Nama
                System.out.print("Masukan Nama Binatang :");
                nama[i] = inputData.nextLine();
                binatang.setNama(nama[i]);

                //Pemilik
                System.out.print("Masukan Nama Pemilik: ");
                pemilik[i] = inputData.nextLine();
                binatang.setPemilik(pemilik[i]);

                //Usia
                System.out.print("Masukan Usia: ");
                usia[i] = inputData.nextLine();

                //Berat
                System.out.print("Masukan Berat:");
                berat[i] = inputData.nextLine();
                meong.setBerat(berat[i]);

            }else if (pilih == 2){
            //Anjing

                //Kode
                System.out.print("Masukan Kode: ");
                kb[i] = inputData.nextLine();
                binatang.setKodeBintang((kb[i]));

                //Nama
                System.out.print("Masukan Nama Binatang:");
                nama[i] = inputData.nextLine();
                binatang.setNama(nama[i]);

                //Pemilik
                System.out.print("Masukan Nama Pemilik: ");
                pemilik[i] = inputData.nextLine();
                binatang.setPemilik(pemilik[i]);

                //Usia
                System.out.print("Masukan Usia: ");
                usia[i] = inputData.nextLine();

                //Kecepatan
                System.out.print("Masukan Kecepatan: ");
                kecepatan[i] = inputData.nextLine();
            }else {
                System.out.println("Inputan Salah");
            }

        }


        System.out.println("Data Telah di Input");



        for(int j=0;j<jmlh;j++){
            kode1[j] = binatang.getKodeBintang();
            nama1[j] = binatang.getNama();
            pemilik1[j] = binatang.getPemilik();

//            String kucing = kb[i].substring(0,1);
//            String anjing = kb[i].substring(0,1);
            System.out.println("\nBinatang");
            System.out.println("Kode Binatang: " + kode1[j]);
            System.out.println("Nama Binatang: " + nama1[j]);
            System.out.println("Nama Pemilik: " + pemilik1[j]);
            System.out.println("Usia Pemilik: " + usia[j]);
        }
    }
}
