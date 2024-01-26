package _01_DecisionStructures_KararYapilari;

public class Soru_10_SwitchCase {

	public static void main(String[] args) {
		
		// switch-case kullanarak ay bulma
		
		int aySirasi=2;
		
		String ay=switch (aySirasi){
			case 1 -> "Ocak";
			case 2 -> "Şubat";
			case 3 -> "Mart";
			case 4 -> "Nisan";
			case 5 -> "Mayıs";
			case 6 -> "Haziran";
			case 7 -> "Temmuz";
			case 8 -> "Ağustos";
			case 9 -> "Eylül";
			case 10 -> "Ekim";
			case 11 -> "Kasım";
			case 12 -> "Aralık";
			default -> "Yanlış seçim";			
		};
		System.out.println(ay);
 }
}
