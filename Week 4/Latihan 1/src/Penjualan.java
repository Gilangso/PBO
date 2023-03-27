public class Penjualan {
    String kode, nama;
    float harga;
    int jumlah;
    float total;


    void setData(String kode, String nama, float harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        total = getTotalPembelian();

    }
    public float getTotalPembelian(){
        return harga*jumlah;
    }
    public void getBonus(){
        if(total>=500000&&jumlah>5){
            System.out.println("Anda Mendapatkan bonus Setrika");
            }else if (total>=100000&&jumlah>3){
                System.out.println("Anda mendapatkan bonus Payung");
            } else if(total>=50000||jumlah>2){
                System.out.println("Anda mendapatkan bonus Ballpoint");
            } else{
                System.out.println("Anda tidak mendapatkan bonus");
            }
        }
        public void cetakNota(){
            System.out.println("-----Nota-----");
            System.out.println("Kode\t: "+kode);
            System.out.println("Nama\t: "+nama);
            System.out.println("Harga\t: "+harga);
            System.out.println("Jumlah\t: "+jumlah);
            System.out.println("Total Pembelian\t: "+total);
            getBonus();
        }
    }
