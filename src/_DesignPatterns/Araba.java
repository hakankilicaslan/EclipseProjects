package _DesignPatterns;

public class Araba {

	//Dışarıdan erişilemeyen yani private olan static ile adresini sabitlediğimiz ve sınıfa bağladığımız için ilk değeri null olan araba tipinde instance adında bir field oluşturduk.
	private static Araba instance=null;
	private String marka;
	
	private Araba(String marka) {
		this.marka=marka;
	}
	
	//Lazy Load ile Singleton
	public static Araba getInstance(String marka) {
		if(instance==null)
			instance=new Araba(marka);
		return instance;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	/*
	 * Nerede kullanabiliriz.
	 * Urun u1=new Urun(101,Kalem,5);
	 * db.save(u1);
	 * 
	 */
	
}
