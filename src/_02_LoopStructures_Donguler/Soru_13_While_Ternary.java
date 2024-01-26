package _02_LoopStructures_Donguler;

public class Soru_13_While_Ternary {

	public static void main(String[] args) {
		
		//Ternary kullanarak while içinde döngü oluşturma
		
		boolean b;
		int i=(int)(10*Math.random());
		int j=(int)(10*Math.random());
		
		while(b=(i>j)?true:false) {
			System.out.println("i "+i+" j "+j);
		i=(int)(10*Math.random());
		j=(int)(10*Math.random());
		}
	}
}
