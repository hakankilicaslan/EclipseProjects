package _MultiThreads;

import java.util.ArrayList;
import java.util.Random;
/*
 * Thread kullanırken ilk olarak senkronize olmaları için listelereDegerEkle() metodumuzu synchronized yaptık ve o şekilde çalışmalarını sağladık.
 * Diğer yolda ArrayList yerine Vector kullanıp synchronized yapmamıza gerek kalmadan senkronize şekilde Threadlerin çalışmasını sağlamak.
 */
public class ThreadliListeYazici {

	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	Random rnd=new Random();
	
	public void threadliEkle() {
		Thread th1=new Thread(()->{
			listelereDegerEkle();
		});
		Thread th2=new Thread(()->{
			listelereDegerEkle();
		});
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("List1 Eleman Sayısı: "+ list1.size()+" List2 Eleman Sayısı: "+ list2.size());
		
	}
	
	public synchronized void listelereDegerEkle() {
		for (int i = 0; i < 500; i++) {
			list1DegerEkle();
			list2DegerEkle();
		}
		
	}
	
	public void list1DegerEkle(){
		list1.add(rnd.nextInt(100));
	}
	
	public void list2DegerEkle(){
		list2.add(rnd.nextInt(100));
	}

}
