package _20_Interface_Arayuz;
/*
 * Bu termometreye bir özellik kazandırmak için ilgili interfaceleri implement ediyoruz.
 * BraunTermometre implements ITermometre,INemOlcer,ITarihSaatGöster diyerek bu interfaceleri sınıfa eklemiş yani uygulamış olduk.
 * Interfaceleri implement ettiğimizde içindeki metodu ya da metotları da eklemek zorundayız.
 * Sanki miras almışız gibi ordaki metodu override ederek eklemiş oluyoruz.
 * 
 */
public class BraunTermometre implements ITermometre,INemOlcer,ITarihSaatGöster {

	@Override
	public int sicaklikOlc() {
		//Burada sıcaklık ölçümüyle ilgili kodlar olduğunu varsayalım...
		return 26;
	}

	@Override
	public double nemOlc() {
		//Burada nem ölçümüyle ilgili kodlar olduğunu varsayalım...
		return 55.55;
	}

	@Override
	public String tarihGoster() {
		return "08.09.2023";
	}

	@Override
	public String saatiGoster() {
		return "13:13";
	}

}
