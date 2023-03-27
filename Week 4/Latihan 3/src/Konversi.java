public class Konversi {
    int detik, menit, jam, hari;

    public Konversi(int dtk){
        detik=dtk;
        if(detik>=86400){
            hari = detik/86400;
            detik = detik - (hari*86400);
        }
//        System.out.println(detik);
        if(detik>=3600){
            jam = detik/3600;
            detik = detik - (jam*3600);
        }
//        System.out.println(detik);
        if(detik>=60){
            menit = detik/60;
            detik = detik - (menit*60);
        }
//        System.out.println(detik);
    }

    public void tampil(){
        System.out.println("Hari\t: "+hari);
        System.out.println("Jam\t: "+jam);
        System.out.println("Menit\t: "+menit);
        System.out.println("Detik\t: "+detik);
    }

}