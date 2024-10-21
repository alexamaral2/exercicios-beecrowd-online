import java.util.Locale;
import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int A, B, SOMA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		sc.close();

	}

}
