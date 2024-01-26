package _MultiThreads;

public class Runner {

	public static void main(String[] args) {

		ThreadsizListeYazici tly1=new ThreadsizListeYazici();
		tly1.listelereDegerEkle();
		ThreadliListeYazici tly2=new ThreadliListeYazici();
		tly2.threadliEkle();
		
	}

}
