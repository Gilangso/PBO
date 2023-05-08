class MahasiswaBaru extends Mahasiswa {
    String asalSekolah;

    boolean ikutOspek() {
        if (semester == 1){
            System.out.println("Harus mengikuti ospek.");
            return true;
        }else{
            System.out.println("Tidak mengikuti ospek.");
            return false;
        }
    }

    @Override
    void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Mahasiswa Harus Ikut Ospek : " + ikutOspek());
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
}