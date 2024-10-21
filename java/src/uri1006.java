import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double A, B, C, MEDIA;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		MEDIA = ((A * 2) + (B * 3) +  (C * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc.close();
	}

}
