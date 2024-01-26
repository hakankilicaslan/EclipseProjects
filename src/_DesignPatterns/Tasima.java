package _DesignPatterns;

public abstract class Tasima {

	private ETasimaTip tip;

	public Tasima(ETasimaTip tip) {
		super();
		this.tip = tip;
	}

	public ETasimaTip getTip() {
		return tip;
	}

	public void setTip(ETasimaTip tip) {
		this.tip = tip;
	}
	
	abstract void tasi();
	
}
