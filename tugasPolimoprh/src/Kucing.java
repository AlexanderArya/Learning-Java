public class Kucing extends Binatang {
    public String Ras;
    private int Berat;

    public void SetBerat(int Berat){
        this.Berat = Berat;
    }

    public int GetBerat(){
        return this.Berat;
    }

    @Override
    public void Cetak() {
        System.out.println("Jenis Binatang : " + super.Jenis);
        System.out.println("Nama : " + super.Nama);
        System.out.println("Ras : " + this.Ras);
        System.out.println("Berat : " + GetBerat());
    }

    @Override
    public void CetakNama() {
        System.out.println(super.Nama);
    }
}