   import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pegawaiTetap pt = new pegawaiTetap();
        pegawaiKontrak pk = new pegawaiKontrak();
        int totPegawai;
        int opsi;

        System.out.print("Masukan total pegawai : ");
        totPegawai = sc.nextInt();
        String[] nip = new String[totPegawai];
        String[] nama = new String[totPegawai];
        int[] gt = new int[totPegawai];
        int[] lembur = new int[totPegawai];
        for (int i = 0; i < totPegawai; i++) {
            System.out.println("Opsi ");
            System.out.println("1. Pegawai Kontrak ");
            System.out.println("2. Pegawai Tetap ");
            System.out.print("Masukan Pilihan : ");
            opsi = sc.nextInt();
            if (opsi == 1) {
                System.out.printf("NIP : ");
                nip[i] = sc.next();
                System.out.print("Nama : ");
                nama[i] = sc.next();
                System.out.print("Banyak Lembur : ");
                lembur[i] = sc.nextInt();
                gt[i] = (int) pk.pegawaiK(lembur[i]);
            } else if (opsi == 2) {
                System.out.printf("NIP : ");
                nip[i] = sc.next();
                System.out.print("Nama : ");
                nama[i] = sc.next();
                System.out.print("Banyak Lembur : ");
                lembur[i] = sc.nextInt();
                gt[i] = (int) pt.pegawaiT(lembur[i]);
            } else {
                System.out.println("Input Invalid");
                i--;
            }
        }
        String lagi = "Y";
        while (lagi.equals("Y")) {
            System.out.println("Menu ");
            System.out.println("1. Profil");
            System.out.println("2. Gaji Terbanyak(Belum Buat)");
            System.out.println("3. Gaji Terkecil(Belum Buat)");
            System.out.println("4. Exit");
            System.out.print("Pilihan : ");
            int pil = sc.nextInt();
            switch (pil) {
                case 1:
                    for (int i = 0; i < totPegawai; i++) {
                        System.out.println("NIP        : " + nip[i]);
                        System.out.println("Nama       : " + nama[i]);
                        System.out.println("Gaji Total : " + gt[i]);
                    }
                    System.out.print("Ingin coba lagi?");
                    lagi = sc.next();
                    if(lagi.equals("Y") || lagi.equals("y")){
                        lagi = "Y";
                    }else {
                    System.out.println("\n\n Terimakasih");
                }
                    break;
                case 2:
                    int maxArray = gt[0];
                    for (int i = 0; i < totPegawai; i++) {
                        if (gt[i] > maxArray) {
                            maxArray = gt[i];
                        }
                    }
                    System.out.println("Jumlah Maximumnya adalah :" + maxArray);

                    System.out.print("Ingin coba lagi?");
                    lagi = sc.next();
                    if(lagi.equals("Y")){
                        lagi = "Y";
                    }else {
                        System.out.println("\n\n Terimakasih");
                    }
                    break;
                case 3:
                int minArray = gt[0];
                    for (int i = 0; i < totPegawai; i++) {
                        if (gt[i] < minArray) {
                            minArray = gt[i];
                        }
                    }
                    System.out.println("Jumlah Maximumnya adalah :" + minArray);

                    System.out.print("Ingin coba lagi?");
                    lagi = sc.next();
                    if(lagi.equals("Y")){
                        lagi = "Y";
                    }else {
                        System.out.println("\n\n Terimakasih");
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih...");
                    lagi = "T";
                    break;
                default:
                    System.out.println("Input Invalid");

                    System.out.print("Ingin coba lagi?");
                    lagi = sc.next();
                    if(lagi.equals("Y")){
                        lagi = "Y";
                    }else {
                        System.out.println("\n\n Terimakasih");
                    }
                    ;
            }
        }
    }
}