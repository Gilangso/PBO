import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String kode, nama;
        float harga;
        int jumlah;
        Penjualan barang = new Penjualan();

        System.out.print("Kode\t: ");
        kode = inp.next();
        System.out.print("Nama\t: ");
        nama = inp.next();
        System.out.print("Harga\t: ");
        harga = inp.nextFloat();
        System.out.print("Jumlah\t: ");
        jumlah = inp.nextInt();
        barang.setData(kode,nama,harga,jumlah);
        barang.cetakNota();
    }
}
