//Andrean Vini Bimo Arya Wibowo
//672021256

import java.util.Scanner;
public class Tester {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Koneksi
        Kucing meong;
        Anjing asu;

        //Deklarasi
        int data1 = 0, data2 = 0, beratTot, KecepatanTot;
        String pilih;

        System.out.print("Masukkan jumlah Binantang: ");
        int jumlah = s.nextInt();
        Binatang[] binatang = new Binatang[jumlah];
        for (int i = 0; i < binatang.length; i++) {
            System.out.println("============================");
            System.out.println("=         Binatang " + (i + 1) + "       =");
            System.out.println("============================");
            System.out.println("= 1. Anjing                =");
            System.out.println("= 2. Kucing                =");
            System.out.println("============================");
            System.out.print("= Masukan Inputan  ");
            pilih = s.next();
            System.out.println("============================");
            if (pilih.equals("1")) {
                asu = new Anjing();
                System.out.print("Masukan Nama Anjing      : ");
                asu.Nama = s.next();
                System.out.print("Masukan Ras Anjing       : ");
                asu.Ras = s.next();
                System.out.print("Masukan Kecepatan Anjing : ");
                asu.setKecepatan(s.nextInt());
                asu.Jenis = "Anjing";
                binatang[i] = asu;
                data1++;
            } else if (pilih.equals("2")) {
                meong = new Kucing();
                System.out.print("Masukan Nama Kucing      : ");
                meong.Nama = s.next();
                System.out.print("Masukan Ras Kucing       : ");
                meong.Ras = s.next();
                System.out.print("Masukan Berat Kucing     : ");
                meong.SetBerat(s.nextInt());
                meong.Jenis = "Kucing";
                binatang[i] = meong;
                data2++;
            } else {
                System.out.println("Data tidak ada");
                i--;
            }
        }
        int looping = 1;

        while (looping == 1) {
            System.out.println("===================================");
            System.out.println("=        TUGAS PEMROGRAMAN        =");
            System.out.println("=        POLIMORFISME JAVA        =");
            System.out.println("===================================");
            System.out.println("= 1.Tampilkan semua nama binatang =");
            System.out.println("= 2.Tampilkan semua data binatang =");
            System.out.println("= 3.Tampilakan binatang terberat  =");
            System.out.println("= 4.Tampilkan binatang tercepat   =");
            System.out.println("= 5.Exit                          =");
            System.out.println("===================================");
            System.out.print("= Masukan inputan : ");
            int pilihan;
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nTampilan Seluruh Nama Binatang ");
                    int nomorNama = 1;
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print( nomorNama + ". ");
                        binatang[i].CetakNama();
                    nomorNama++;
                    }
                    break;
                case 2:
                    int nomorData = 1;
                    System.out.println("\nTampilan Seluruh Data Binatang ");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nData bintang ke " + nomorData);
                        binatang[i].Cetak();
                    nomorData++;
                    }
                    break;
                case 3:
                    //Deklarasi
                    int[] berat = new int[data2];
                    int[] urutanBerat = new int[data2];
                    int dataKucing = 0;

                    //Program
                    System.out.println(" Tampilan Data terberat");
                    if (data2 == 0) {
                        System.out.println("Data Berat tidak ada");
                    } else {
                        int a = 0;
                        for (int i = 0; i < jumlah; i++) {
                            if(binatang[i].Jenis.equals("Kucing")) {
                                meong = (Kucing) binatang[i];
                                urutanBerat[a] = i;
                                berat[a] = meong.GetBerat();
                                a++;
                            }
                        }
                        beratTot = berat[0];
                        for (int i = 0; i < berat.length; i++) {
                            if (beratTot <= berat[i]) {
                                beratTot = berat[i];
                                dataKucing = urutanBerat[i];
                            }
                        }
                        System.out.println("Kucing "+ binatang[dataKucing].Nama + " adalah yang terberat (" + beratTot + "kg)");
                    }

                    break;
                case 4:
                    //Deklarasi
                    int[] kecepatan = new int[data1];
                    int[] urutanCepat = new int[data1];
                    int dataAnjing = 0;

                    //Program
                    if(data2 == 0) {
                        System.out.println("Data Anjing tidak ada");
                    }else {
                        int a = 0;
                        for (int i = 0; i < jumlah; i++) {
                            if (binatang[i].Jenis.equals("Anjing")) {
                                asu = (Anjing) binatang[i];
                                urutanCepat[a] = i;
                                kecepatan[a] = asu.getKecepatan();
                                a++;
                            }
                        }
                        KecepatanTot = kecepatan[0];
                        for (int i = 0; i < kecepatan.length; i++) {
                            if (KecepatanTot <= kecepatan[i]) {
                                KecepatanTot = kecepatan[i];
                                dataAnjing = urutanCepat[i];
                            }
                        }
                        System.out.println("Anjing " + binatang[dataAnjing].Nama + " adalah yang terberat (" + KecepatanTot + " mph)");
                    }
                    break;
                case 5:
                    System.out.println("Terimakasih....");
                    looping = 0;
                    break;
            }
        }

    }
}