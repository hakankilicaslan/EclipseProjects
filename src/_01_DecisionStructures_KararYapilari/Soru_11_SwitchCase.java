package _01_DecisionStructures_KararYapilari;

public class Soru_11_SwitchCase {

	public static void main(String[] args) {
		// switch-case içinde yield kullanma
		
		int n=2;
		int result=switch (n) {
		case 1 -> {
			int x=10;
			int y=20;
			yield x+y;
		}
		case 2 -> {
			int x=100;
			int y=200;
			yield x+y;
		}
		default -> n;
		};
		System.out.println(result);
 }
}
