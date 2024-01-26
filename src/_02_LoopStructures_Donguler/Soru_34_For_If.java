package _02_LoopStructures_Donguler;

public class Soru_34_For_If {

	public static void main(String[] args) {
		
		//break komutu kullanarak blok ve döngüyü kırma
		
		dongu:
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				if(i==1 && j==2) {
					break dongu; //sadece break koyduğumuzda i=1&j=2 olduğu koşulu yazdırmadı ama döngüye devam etti. Döngüyü de kırmak istersek for üstüne ve break yanına krımak istediğimiz döngü ismi gibi bir şey yazıyoruz.
				}
				System.out.println("i= "+i+ " j= "+j);
			}
		}
	}
}
