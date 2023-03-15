public class Sepeda {
    int gear = 5;
    int jumlahRoda;
    String merk;
    String jenis;

    void ngerem(){
        System.out.println("Sepeda di rem");
    }

    Sepeda(int jumlahRoda,String jenis, String merk ){
        System.out.println("Sepeda "+ jenis +" bermerk "+merk+" Memiliki jumlah roda "+ jumlahRoda);
        this.jenis = jenis;
        this.merk = merk;
        this.jumlahRoda = jumlahRoda;
    }

}
class sepedaBMX{
    int ukuranban;
    String merk;
    int kecepatan;



    void Melompat(){
        System.out.println("Sepeda Melompat");
    }
    sepedaBMX(int ukuranban,int kecepatan,String merk){
        System.out.println("merk sepeda "+ merk+" ukuran ban "+ukuranban+ " inci "+"Kecepatan yang dapat di peroleh " +kecepatan +" KM/h");
    }
    
}
class Aksisepeda{
    public static void main(String[] args){
        Sepeda sepedaBalap = new Sepeda(2,"x", "y");
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah Gear "+gearSepeda);
        sepedaBalap.ngerem();
        System.out.println("\n ");
        sepedaBMX sepedafreestyle= new sepedaBMX(16, 30, "United");
        sepedafreestyle.Melompat();
        
    }
}


