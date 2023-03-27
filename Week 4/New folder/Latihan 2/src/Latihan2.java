import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Determinan det;
        float a,b,c;
        System.out.print("input A : ");
        a = inp.nextFloat();
        System.out.print("input B : ");
        b = inp.nextFloat();
        System.out.print("input C : ");
        c = inp.nextFloat();
        det = new Determinan(a,b,c);
        System.out.println("Det = "+det.det);
        if(det.det<0){
            System.out.println("X1 = "+det.x1+"i");
            System.out.println("X2 = "+det.x2+"i");
        }else {
            System.out.println("X1 = " + det.x1);
            System.out.println("X2 = " + det.x2);
        }
    }
}