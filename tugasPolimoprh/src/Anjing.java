public class Anjing extends Binatang{
    private int Kecepatan;
    public String Ras;

    public int getKecepatan()
    {
        return this.Kecepatan;
    }

    public void setKecepatan(int Kecepatan)
    {
        this.Kecepatan = Kecepatan;
    }

    @Override
    public void Cetak() {
        System.out.println("Jenis Bintang : " + super.Jenis);
        System.out.println("Nama      : " + super.Nama);
        System.out.println("Ras       : " + this.Ras);
        System.out.println("Kecepatan : " + getKecepatan());

    }

    @Override
    public void CetakNama() {
        System.out.println(super.Nama);

    }
}