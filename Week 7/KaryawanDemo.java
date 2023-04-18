public class KaryawanDemo {
    public static void main(String[] args) {
    
        KaryawanTetap karyawan1 = new KaryawanTetap("John Doe", 2, 5000000);
        int totalGaji1 = karyawan1.totalGaji();
        System.out.println(karyawan1.getNama() + " mendapat total gaji sebesar " + totalGaji1);

        KaryawanKontrak karyawan2 = new KaryawanKontrak("Jane Doe", 4, 100000);
        KaryawanKontrak karyawan3 = new KaryawanKontrak("Gilang", 1, 50000);
        int totalUpah2 = karyawan2.TotalUpah(5);
        int totalUpah3 = karyawan3.TotalUpah(3);
        System.out.println(karyawan2.getNama() + " mendapat total upah sebesar " + totalUpah2);
        System.out.println(karyawan3.getNama() + " mendapat total upah sebesar " + totalUpah3);
    }
}
