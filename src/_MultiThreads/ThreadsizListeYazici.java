package _MultiThreads;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListeYazici {

	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	Random rnd=new Random();
	
	public void listelereDegerEkle() {
		for (int i = 0; i < 1000; i++) {
			list1DegerEkle();
			list2DegerEkle();
		}
		System.out.println("List1 Eleman Sayısı: "+ list1.size()+" List2 Eleman Sayısı: "+ list2.size());
	}
	
	public void list1DegerEkle(){
		list1.add(rnd.nextInt(100));
	}
	
	public void list2DegerEkle(){
		list2.add(rnd.nextInt(100));
	}

}
