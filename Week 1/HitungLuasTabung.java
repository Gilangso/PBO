public class HitungVolumeTabung {
    public static void main(String[] args) {
        
        // Menghitung Volume Tabung
        double diameter_tabung = 5;
        double radius_tabung = diameter_tabung / 2;
        double tinggi_tabung = 10;
        double volume_tabung = Math.PI * Math.pow(radius_tabung, 2) * tinggi_tabung;
        System.out.println("Volume tabung dengan diameter " + diameter_tabung + " dan tinggi " + tinggi_tabung + " adalah: " + volume_tabung);
    }
}
