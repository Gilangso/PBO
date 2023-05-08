class MahasiswaLulus extends Mahasiswa {
    int tahunMasuk;
    float ipk;

    boolean ikutWisuda(){
        if(tahunMasuk < 2018 && tahunMasuk <= 2020){
            System.out.println("Mahasiswa sudah lulus");
            return true;
        }else{
            System.out.println("Mahasiswa Belum lulus");
            return false;
        }
    }

    @Override
    void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println(ikutWisuda());
        System.out.println("IPK: " + ipk);
    }
}