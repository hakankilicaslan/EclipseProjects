package _20_Interface_Arayuz;

public class Runner {

	public static void main(String[] args) {
		
	//ITermometre termometre=new ITermometre(); Interfacelerden nesne üretemiyoruz.
		
	BraunTermometre bt=new BraunTermometre();
	System.out.println(bt.sicaklikOlc());
	System.out.println(bt.nemOlc());
	System.out.println(bt.tarihGoster());
	System.out.println(bt.saatiGoster());
	
	SinboTermometre st=new SinboTermometre();
	System.out.println(st.sicaklikOlc());
	System.out.println(st.nemOlc());
	//BraunTermometre ve SinboTermometre barındırdıkları özelliklere göre interfaceleri implement etmiş ve uygulamış oldu
	
	
	Olcum olcum1=new Olcum(); //Olcum sınıfından bir nesne oluşturuyoruz.
	/* 
	 * Olcum sınıfından oluşturduğumuz nesne ile içindeki metotlara erişebiliyoruz.
	 * Eriştiğimiz metotların parametrelerindeki interfaceleri implement eden sınıfların nesnelerini parametre olarak verebiliyoruz.
	 * Bu sayede yine polymorphism özelliğini kullanmış oluyoruz. 
	 */
	olcum1.nemOlc(bt);
	olcum1.nemOlc(st);
	
	olcum1.tarihSaatGoster(bt);
	//olcum1.tarihSaatGoster(st); //ITarihSaatGoster interface'i SinboTermometre tarafından implement edilmediği yani bu özelliği barındırmadığı için st üzerinden Olcum sınıfındaki bu metodu çağıramıyoruz.
	
	//Olcum sınıfından termometreOlustur() metoduyla yeni bir termometre oluşturuyoruz.
	//Oluşturduğumuz sınıfın sicaklikOlc() metodunu çağırıyoruz ama hangi sınıftan oluşturduğunu bilmiyoruz sadece sicaklikOlc metodunu çağırıyoruz.
	//Burada soyutlama ve gizleme yapmış oluyoruz.
	ITermometre it=olcum1.termometreOlustur();
	System.out.println(it.sicaklikOlc());
	
	}
	
}
