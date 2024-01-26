package _DesignPatterns;

public class Ucak extends Tasima{

	public Ucak() {
		super(ETasimaTip.HAVA);
		tasi();
	}

	@Override
	void tasi() {
		System.out.println("Uçak taşıma işlemini gerçekleştirdi.");
	}

}
