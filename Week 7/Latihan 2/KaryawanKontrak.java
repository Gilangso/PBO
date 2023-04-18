
public class KaryawanKontrak extends Karyawan{
    int upahHarian;
    public KaryawanKontrak(String nama, int tunjanganAnak, int upahHarian) {
        super(nama, tunjanganAnak);
        this.upahHarian = upahHarian;

    }
    
    public int TotalUpah(int jumlahHariMasuk){
        int tunjanganAnak = getTunjaganAnak()* 50000;
        return (upahHarian * jumlahHariMasuk) + tunjanganAnak;
    }

}
