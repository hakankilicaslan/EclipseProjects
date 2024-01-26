package _DesignPatterns;

public class ArabaEager {
	
	//Eager: Hemen Lazy:Sonra
	
	private static ArabaEager instance=new ArabaEager();
	private String marka;
	
	private ArabaEager() {
		
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public static ArabaEager getInstance() {
		return instance;
	}
	
}
