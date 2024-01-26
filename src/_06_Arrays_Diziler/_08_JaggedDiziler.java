package _06_Arrays_Diziler;

public class _08_JaggedDiziler {

	public static void main(String[] args) {
		
		//Jagged Arrays: Satır sayısı belli olup sütun sayısı belli olmayan çoklu dizilere Jagged dizi denir. Her satıra farklı bir sütun sayısı tanımlayabiliriz.
		
		String[][] jaggedDizi=new String[3][]; //Satır sayısını 3 olarak atadık ama satırdaki sütun sayısı belli değil.
		
		jaggedDizi[0]=new String[3]; //İlk satırımıza yani 0.index satırına 3 elemanlı sütun tanımlamış olduk.
		jaggedDizi[0][0]="1";
		jaggedDizi[0][1]="100";
		jaggedDizi[0][2]="Ece";
		
		jaggedDizi[1]=new String[4]; //İkinci satırımıza yani 1.index satırına 4 elemanlı sütun tanımlamış olduk.
		jaggedDizi[1][0]="2";
		jaggedDizi[1][1]="101";
		jaggedDizi[1][2]="Su";
		jaggedDizi[1][3]="90";
		
		jaggedDizi[2]=new String[2]; //Üçüncü satırımıza yani 2.index satırına 2 elemanlı sütun tanımlamış olduk.
		jaggedDizi[2][0]="3";
		jaggedDizi[2][1]="102";
		
		
		for (int i = 0; i < jaggedDizi.length; i++) {
			for (int j = 0; j < jaggedDizi[i].length; j++) {
				System.out.print(jaggedDizi[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
