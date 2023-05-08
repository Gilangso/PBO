class MahasiswaTransfer extends MahasiswaBaru {
    String asalUniversitas;

    boolean ikutOspek() {
        return super.ikutOspek();
    }

    @Override
    void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas: " + asalUniversitas);
    }
}