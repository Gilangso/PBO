import Transportasi.*;
public class TransportasiDemo{
	public static void main(String[] args){
		Mobil m = new Mobil("Honda","Sedan",4);
		m.menginjakGas();
		Bicycle b = new Bicycle("United",2);
		b.diKayuh();
	}
}