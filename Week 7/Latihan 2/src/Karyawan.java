public class Karyawan {
    private String nama;
    private int tunjanganAnak;

    public Karyawan(String nama, int tunjanganAnak){
        this.nama = nama;
        this.tunjanganAnak = tunjanganAnak;
    }
    public String getNama(){
        return nama;
    }
    
    public int getTunjaganAnak(){
        return tunjanganAnak;
    }

}

