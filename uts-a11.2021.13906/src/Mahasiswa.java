class Mahasiswa {
    String nim;
    String nama;
    int semester;
    int usia;
    String[] krs;

    float hitungRataNilai(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return (float) total / nilai.length;
    }

    void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
        System.out.print("KRS: ");
        for (int i = 0; i < krs.length; i++) {
            System.out.print(krs[i] + " ");
        }
        System.out.println();
    }
}
