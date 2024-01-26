package _DesignPatterns;

public class Gemi extends Tasima{

	public Gemi() {
		super(ETasimaTip.DENİZ);
		tasi();
	}

	@Override
	void tasi() {
		System.out.println("Gemi taşıma işlemini gerçekleştirdi.");
	}

}
