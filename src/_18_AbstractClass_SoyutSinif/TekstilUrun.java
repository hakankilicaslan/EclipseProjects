package _18_AbstractClass_SoyutSinif;

public class TekstilUrun extends Urun{

	public TekstilUrun(String ad, double fiyat) {
		super(ad, fiyat);
	}

	@Override
	public double fiyatHesapla() {
		return 0;
	}

}
