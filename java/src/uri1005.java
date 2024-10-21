import java.util.Locale;
import java.util.Scanner;

public class uri1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float n1, n2;
		double media;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		
		media = ((n1 * 3.5) + (n2 * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}
