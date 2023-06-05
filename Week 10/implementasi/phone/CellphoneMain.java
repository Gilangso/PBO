package implementasi.phone;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3311");
        cp.powerOn();
        System.out.println("Battery saat ini: " + cp.getBattery());
        System.out.println("Volume saat ini: " + cp.getVolume());
        cp.volumeUp();
        cp.volumeUp();
        cp.volumeDown();
        System.out.println("Volume saat ini: " + cp.getVolume());
        System.out.println("Saldo pulsa saat ini: " + cp.getSaldo());
        cp.TopUpPulsa(2000);
        System.out.println("Saldo pulsa saat ini: " + cp.getSaldo());
        cp.addContact("Nurulya", "08121192039");
        cp.addContact("Nuril", "081211920312");
        cp.addContact("Nurel", "081211921212");
        
        cp.findContact("Nurulya");
        cp.powerOff();
        cp.findContact("Nurulya");
        cp.showContact();
    }
} 