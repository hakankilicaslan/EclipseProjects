package _20_Interface_Arayuz;

public class SinboTermometre implements INemOlcer,ITermometre{

	@Override
	public int sicaklikOlc() {
		return 25;
	}
	
	//Interfaceten metodu override ettikten sonra metodu overload ederek farklı amaçlarla da kullanabiliriz.
	public int sicaklikOlc(int hassasiyet) { //Metot Overloading: İmzalar farklı(Ad+Parametre) 
		return 25+hassasiyet;
	}

	@Override
	public double nemOlc() {
		return 60.95;
	}

}
