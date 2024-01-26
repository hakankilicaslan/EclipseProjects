package _DesignPatterns;

public class TasimaFactory {

	public static Tasima builder(ETasimaTip tip) {
	
		switch (tip) {
		
		case KARA: return new Kamyon();
		case DENİZ: return new Gemi();	
		case HAVA: return new Ucak();
		default: return new Kamyon();
		
		}
		
	}
	
}
