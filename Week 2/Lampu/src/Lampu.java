public class Lampu {
    boolean nyala;

    void nyalakanLampu(){
        nyala = true;
        System.out.println("Apakah lampu menyala? "+ nyala);

    }
    void matikanLampu(){
        nyala = false;
        System.out.println("Apakah lampu menyala? "+ nyala);
    }

    public static void main(String[] args) throws Exception {
        
        Lampu LED = new Lampu();
        Lampu Bohlam = new Lampu();
        LED.nyalakanLampu();
        Bohlam.matikanLampu();
    }
}
