package _23_EnumInterfaceKullanimi;

public enum Gun implements IHafta { //Enum oluşturulurken Interfaces kısmından add ile implement etmek istediğimiz interface seçilebilir ya da oluşturduktan sonra implements IHafta diyerekte yapabiliriz. Enumlara interface implemantasyonu yapılabilir. Ama enumlarda kalıtım yapamazsınız (extends) kullanılmaz.
	
	PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESİ, PAZAR; //Enum elemanlarını ekledik ve içinde metot kullanacağımız için sonuncusundan sonra ; koyduk.
	
	@Override
	public int kacinciGun() { //Haftanın kaçıncı günü olduğunu döneceği için ordinal() metoduyla indexini alıp 1 artırıyoruz.
		return ordinal()+1;
	}

}
