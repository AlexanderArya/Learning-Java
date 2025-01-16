public class pegawaiKontrak {
    public double pegawaiK(int lem){
        int gp = 5_000_000;
        int lm = lem * 50_000;
        double t = gp * 0.12;
        return gp + lm + t;
    }

}

