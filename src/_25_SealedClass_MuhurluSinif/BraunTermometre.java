package _25_SealedClass_MuhurluSinif;

//BraunTermometre sınıfına sealed ITermometre interface'i permits ile izin verdiği için non-sealed tanımlanarak ITermometre interface'ini implement edebiliyor.
public non-sealed class BraunTermometre implements ITermometre {

	@Override
	public int sicaklikOlc() {
		return 0;
	}

	/*
	 Çift tırnak kullanarak String bir ifade oluştururken aşağı satıra geçtiğimizde sistem her alt satıra geçerken + ile ifadeleri birbirine bağlıyor.
	 
	 String mesaj = "Merhaba"
				 + "Java12"
				 + "Sınıfı";
				 
	 Üç tırnak kullanarak String bir ifade oluşturduğumuzda alt satıra geçerken kelimeler arası + koymamıza gerek kalmıyor.
	
	 String mesajBlock = """ 
				        Hakan
				        Kılıçaslan
				        """; 
	 */
	
}
