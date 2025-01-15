public class Kucing{
    private String berat;

    public void Menggenong(){
        System.out.println("Meong");
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public void displayKucing(){
        System.out.println(getBerat());
    }
}
