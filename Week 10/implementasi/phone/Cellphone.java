package implementasi.phone;
import java.lang.Math;
import java.util.ArrayList;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int saldo;
    ArrayList<Contact> contact;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
        this.saldo = 0 ;
        this.volume = 50;
        this.contact = new ArrayList<>();
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume--;
            if(this.volume<=0)
            {
                this.volume = 0;
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
    
    public void TopUpPulsa(int jumlah){
        if(this.status == 1){
            saldo =+ jumlah;
            System.out.println("Pulsa berhasil ditambahkan: "+ jumlah);
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan top-up pulsa.");
        }
    }

    public int getSaldo() {
        return this.saldo;
    }
    public int getBattery(){
        return this.batteryLevel;
    }

    public void addContact(String nama, String nomor){
		if(status==1){
			contact.add(new Contact(nama,nomor));
		}else{
            System.out.println("Ponsel mati, Tidak dapat menambahkan kontak");
        }
	}
	
	public void showContact(){
		if(status==1){
			if(contact.isEmpty()){
				System.out.println("Kontak masih kosong.");
			} else{
				System.out.println("-----List Kontak-----");
				for(int i=0; i<contact.size();i++){
					Contact kt = contact.get(i);
					System.out.println((i+1)+". "+kt.nama+" - "+kt.nomor);
                }
            }
        }else{
            System.out.println("Ponsel mati, Tidak dapat melihat Kontak");
        }
	}
	
	public void findContact(String nama){
		if(status == 1){
			if(contact.isEmpty()){
				System.out.println("Kontak masih kosong.");
			} else{
				System.out.println("Mencari kontak dengan nama "+nama);
				String namaLower = nama.toLowerCase();
				boolean found = false;
				int count = 1;
				for(int i=0; i<contact.size();i++){
					Contact kt = contact.get(i);
					if(kt.nama.toLowerCase().indexOf(namaLower) != -1){
						System.out.println(count+". "+kt.nama+" - "+kt.nomor);
						found = true;
						count++;
					}
				}
				if(!found)
					System.out.println("Kontak dengan nama "+nama+" tidak ditemukan!");
			}
		}
	}
}