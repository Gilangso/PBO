import java.util.Scanner; // Mengimpor kelas Scanner

public class Main {
    public static void main(String[] args) {
        // Membuat objek scanner untuk membaca input
        Scanner scan = new Scanner(System.in);

        // Membuat array untuk menyimpan objek-objek mahasiswa
        Mahasiswa[] mahasiswa;

        // Membaca input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scan.nextInt();

        scan.nextLine(); // Membersihkan buffer

        // Menginisialisasi array mahasiswa dengan panjang sesuai input
        mahasiswa = new Mahasiswa[jumlahMahasiswa];

        // Perulangan untuk membuat objek-objek mahasiswa sesuai jenisnya
        for (int i = 0; i < jumlahMahasiswa; i++) {
            // Membaca input jenis mahasiswa
            System.out.print("Masukkan jenis mahasiswa ke-" + (i + 1) + " (aktif/baru/transfer/lulus): ");
            String jenisMahasiswa = scan.nextLine();

            // Mengecek jenis mahasiswa dan membuat objek sesuai kelasnya
            if (jenisMahasiswa.equalsIgnoreCase("aktif")) { // Jika jenis mahasiswa adalah aktif
                // Membuat objek dari kelas Mahasiswa
                    Mahasiswa m = new Mahasiswa();

                    System.out.print("Masukkan NIM mahasiswa aktif: ");
                    m.nim = scan.nextLine(); // Membaca input NIM

                    System.out.print("Masukkan nama mahasiswa aktif: ");
                    m.nama = scan.nextLine(); // Membaca input nama

                    System.out.print("Masukkan semester mahasiswa aktif: ");
                    m.semester = scan.nextInt(); // Membaca input semester

                    System.out.print("Masukkan usia mahasiswa aktif: ");
                    m.usia = scan.nextInt(); // Membaca input usia

                    System.out.print("Masukkan jumlah mata kuliah yang diambil mahasiswa aktif: ");
                    int jumlahKrsM = scan.nextInt(); // Membaca input jumlah mata kuliah

                    scan.nextLine(); // Membersihkan buffer
                    m.krs = new String[jumlahKrsM]; // Menginisialisasi array krs dengan panjang sesuai input
                    for (int j = 0; j < jumlahKrsM; j++) { // Perulangan untuk membaca input mata kuliah

                    System.out.print("Masukkan mata kuliah ke-" + (j + 1) + " mahasiswa aktif: ");
                    m.krs[j] = scan.nextLine(); // Membaca input mata kuliah dan menyimpannya di array krs
                }
                // Menyimpan objek m di array mahasiswa pada indeks i
                mahasiswa[i] = m;
            } // Jika jenis mahasiswa adalah baru
            else if (jenisMahasiswa.equalsIgnoreCase("baru")) { // Jika jenis mahasiswa adalah baru
                // Membuat objek dari kelas MahasiswaBaru
                MahasiswaBaru m = new MahasiswaBaru();
                
                    System.out.print("Masukkan NIM mahasiswa baru: ");
                    m.nim = scan.nextLine(); // Membaca input NIM



                    System.out.print("Masukkan nama mahasiswa baru: ");
                    m.nama = scan.nextLine(); // Membaca input nama

                    System.out.print("Masukkan semester mahasiswa baru: ");
                    m.semester = scan.nextInt(); // Membaca input semester

                    m.ikutOspek();

                    System.out.print("Masukkan usia mahasiswa baru: ");
                    m.usia = scan.nextInt(); // Membaca input usia

                    System.out.print("Masukkan jumlah mata kuliah yang diambil mahasiswa baru: ");
                    int jumlahKrsM = scan.nextInt(); // Membaca input jumlah mata kuliah

                    scan.nextLine(); // Membersihkan buffer
                    m.krs = new String[jumlahKrsM]; // Menginisialisasi array krs dengan panjang sesuai input
                    for (int j = 0; j < jumlahKrsM; j++) { // Perulangan untuk membaca input mata kuliah

                        System.out.print("Masukkan mata kuliah ke-" + (j + 1) + " mahasiswa baru: ");
                        m.krs[j] = scan.nextLine(); // Membaca input mata kuliah dan menyimpannya di array krs
                }
                    System.out.print("Masukkan asal sekolah mahasiswa baru: ");
                    m.asalSekolah = scan.nextLine(); // Membaca input asal sekolah
                    // Menyimpan objek m di array mahasiswa pada indeks i
                    mahasiswa[i] = m;
            } else if (jenisMahasiswa.equalsIgnoreCase("transfer")) { // Jika jenis mahasiswa adalah transfer

                // Membuat objek dari kelas MahasiswaTransfer
                MahasiswaTransfer m = new MahasiswaTransfer();

                    System.out.print("Masukkan NIM mahasiswa transfer: ");
                    m.nim = scan.nextLine(); // Membaca input NIM

                    System.out.print("Masukkan nama mahasiswa transfer: ");
                    m.nama = scan.nextLine(); // Membaca input nama

                    System.out.print("Masukkan semester mahasiswa transfer: ");
                    m.semester = scan.nextInt(); // Membaca input semester

                    System.out.print("Masukkan usia mahasiswa transfer: ");
                    m.usia = scan.nextInt(); // Membaca input usia

                    System.out.print("Masukkan jumlah mata kuliah yang diambil mahasiswa transfer: ");
                    int jumlahKrsM = scan.nextInt(); // Membaca input jumlah mata kuliah
                    scan.nextLine(); // Membersihkan buffer

                    m.krs = new String[jumlahKrsM]; // Menginisialisasi array krs dengan panjang sesuai input
                    for (int j = 0; j < jumlahKrsM; j++) { // Perulangan untuk membaca input mata kuliah

                        System.out.print("Masukkan mata kuliah ke-" + (j + 1) + " mahasiswa transfer: ");
                        m.krs[j] = scan.nextLine(); // Membaca input mata kuliah dan menyimpannya di array krs
                    }
                        System.out.print("Masukkan asal sekolah mahasiswa transfer: ");
                        m.asalSekolah = scan.nextLine(); // Membaca input asal sekolah

                    System.out.print("Masukkan asal universitas mahasiswa transfer: ");
                    m.asalUniversitas = scan.nextLine(); // Membaca input asal universitas

                    // Menyimpan objek m di array mahasiswa pada indeks i
                    mahasiswa[i] = m;

            } else if (jenisMahasiswa.equalsIgnoreCase("lulus")) { // Jika jenis mahasiswa adalah lulus
                // Membuat objek dari kelas MahasiswaLulus
                    MahasiswaLulus m = new MahasiswaLulus();
                    System.out.print("Masukkan NIM mahasiswa lulus: ");
                    m.nim = scan.nextLine(); // Membaca input NIM

                    System.out.print("Masukkan nama mahasiswa lulus: ");
                    m.nama = scan.nextLine(); // Membaca input nama

                    System.out.print("Masukkan semester mahasiswa lulus: ");
                    m.semester = scan.nextInt(); // Membaca input semester

                    System.out.print("Masukkan usia mahasiswa lulus: ");
                    m.usia = scan.nextInt(); // Membaca input usia

                    System.out.print("Masukkan jumlah mata kuliah yang diambil mahasiswa lulus: ");
                    int jumlahKrsM = scan.nextInt(); // Membaca input jumlah mata kuliah

                    scan.nextLine(); // Membersihkan buffer

                    m.krs = new String[jumlahKrsM]; // Menginisialisasi array krs dengan panjang sesuai input
                    for (int j = 0; j < jumlahKrsM; j++) { // Perulangan untuk membaca input mata kuliah
                        System.out.print("Masukkan mata kuliah ke-" + (j + 1) + " mahasiswa lulus: ");
                        m.krs[j] = scan.nextLine(); // Membaca input mata kuliah dan menyimpannya di array krs
                    }
                        System.out.print("Masukkan tahun Masuk mahasiswa lulus: ");
                        m.tahunMasuk = scan.nextInt(); // Membaca input tahun masuk

                        System.out.print("Masukkan IPK mahasiswa lulus: ");
                            m.ipk = scan.nextFloat(); // Membaca input IPK

                        scan.nextLine(); // Membersihkan buffer
                
                // Menyimpan objek m di array mahasiswa pada indeks i
                mahasiswa[i] = m;
            } else { // Jika jenis mahasiswa tidak valid
                System.out.println("Jenis mahasiswa tidak valid.");
            }
        }

        // Menampilkan informasi mahasiswa dan rata-rata nilai mereka
            System.out.println("Informasi mahasiswa:");
            System.out.println();

        // Perulangan untuk menampilkan informasi setiap objek mahasiswa di array
        for (int i = 0; i < jumlahMahasiswa; i++) {
                // Membaca input nilai-nilai mahasiswa
                System.out.print("Masukkan jumlah nilai yang dimiliki mahasiswa ke-" + (i + 1) + ": ");
                int jumlahNilai = scan.nextInt(); // Membaca input jumlah nilai
                scan.nextLine(); // Membersihkan buffer
                int[] nilai = new int[jumlahNilai]; // Menginisialisasi array nilai dengan panjang sesuai input
                for (int j = 0; j < jumlahNilai; j++) { // Perulangan untuk membaca input nilai-nilai
                    System.out.print("Masukkan nilai ke-" + (j + 1) + " mahasiswa ke-" + (i + 1) + ": ");
                    nilai[j] = scan.nextInt(); // Membaca input nilai dan menyimpannya di array nilai
                    scan.nextLine(); // Membersihkan buffer
                }
            // Menampilkan informasi mahasiswa dan rata-rata nilainya dengan memanggil
            // metode infoMahasiswa dan hitungRataNilai dari objek mahasiswa di array
                System.out.println("Mahasiswa ke-" + (i + 1) + ":");
                mahasiswa[i].infoMahasiswa();
                System.out.println("Rata-rata nilai: " + mahasiswa[i].hitungRataNilai(nilai));
                System.out.println();
        }

        // Menutup scanner
            scan.close();

    }
}