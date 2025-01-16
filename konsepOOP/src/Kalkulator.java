public class Kalkulator {
    public int angka1;
    public int angka2;

    public void tambah(){
        int h_tambah = angka1 + angka2;
        System.out.println("Hasil Tambah :" + h_tambah);
    }

    public void kurang(){
        int h_kurang = angka1 - angka2;
        System.out.println("Hasil Kurang :" + h_kurang);
    }

    public int kali(){
        int h_kali = angka1 * angka2;
        return h_kali;
    }

    public double bagi(){
        double h_bagi = angka1/angka2;
        return h_bagi;
    }

    public double pangkat(int a,int b){
        return Math.pow(a,b);
    }
}
