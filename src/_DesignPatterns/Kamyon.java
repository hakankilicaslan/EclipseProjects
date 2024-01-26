package _DesignPatterns;

public class Kamyon extends Tasima{

	public Kamyon() {
		super(ETasimaTip.KARA);
		tasi();
	}

	@Override
	void tasi() {
		System.out.println("Kamyon taşıma işlemini gerçekleştirdi.");
	}

}
