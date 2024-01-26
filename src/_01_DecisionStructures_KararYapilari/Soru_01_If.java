package _01_DecisionStructures_KararYapilari;

import java.util.Scanner;

public class Soru_01_If {

	public static void main(String[] args) {
		// Kullanıcıların yaşlarına göre mesaj alacaklar.18 yaş altı kullanıcılara "Bu
		// içeriğe erişim izniniz yok."
		// 18-30 yaş arasındakilere "İçeriği görüntülemek için yaşınız yeterli"
		// 30 yaş üstü kullanıcılara "Bu içerik sizin yaş grubunuza yönelik değildir"
		// mesajı gösterilecek.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Yaşınızı giriniz:");
		int yas = scanner.nextInt();

		if (yas > 0) {
			if (yas < 18)
				System.out.println("Bu içeriğe erişim izniniz yok");
			else if (yas >= 18 && yas < 30)
				System.out.println("İçeriği görüntülemek için yaşınız yeterli");
			else if (yas >= 30)
				System.out.println("Bu içerik sizin yaş grubunuza yönelik değildir");
		} else
			System.out.println("Yaşınız negatif olamaz");
	}
}
