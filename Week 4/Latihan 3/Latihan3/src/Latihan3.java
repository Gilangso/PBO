import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int detik;
        System.out.print("Detik\t: ");
        detik = inp.nextInt();
        Konversi konv = new Konversi(detik);
        konv.tampil();
    }
}