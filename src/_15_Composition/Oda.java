package _15_Composition;

public class Oda {
	
	private int odaNo;
	private String odaAd;
	
	public Oda(int odaNo, String odaAd) {
		super();
		this.odaNo=odaNo;
		this.odaAd=odaAd;
	}
	
	public void odaBilgileriGetir() {
		System.out.println("Oda no: "+ odaNo+ " Oda ad: "+odaAd);
	}

}
