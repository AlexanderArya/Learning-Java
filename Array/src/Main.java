import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList datasaya = new ArrayList();
    ArrayList datasaya2 = new ArrayList();
    datasaya.add("bimo");
    datasaya.add("672021256");
    datasaya.add(19);
    datasaya.add(3.6);
    datasaya.add(true);
    int a = 5000;
    datasaya.add("bimo");
    datasaya.add("672021256");
    datasaya.add(19);
    datasaya.add(3.6);
    datasaya.add(true);
    // Melihat data
    System.out.println("Sebelum di ganti: " + datasaya);
    // System.out.println("Mendapatkan 1 data :"+datasaya.get(2) * a);
    System.out.println(datasaya2);

    // Mengganti Data
    datasaya.set(0, "Aryaa");
    datasaya.set(2, 22);
    System.out.println("Sesudah di ganti: " + datasaya);

    // Menghapus Data
    datasaya.remove(true);
    System.out.println("Sesudah di hapus: " + datasaya);

    // Melihat Panjang Data
    System.out.println("Banyak data adalah :" + datasaya.size());
  }
}