package _26_AnonymousInnerClass;

public class BraunTermometre implements ITermometre { //implements ITermometre diyerek sınıfımıza ITermometre interface'ini implement edebilmek için sicaklikOlc() metodunu override etmek zorunda kaldık. 

	@Override
	public int sicaklikOlc() {
		return 26;
	}

}
