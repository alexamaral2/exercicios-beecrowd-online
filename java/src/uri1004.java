import java.util.Locale;
import java.util.Scanner;

public class uri1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int valor1, valor2, prod;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		prod = valor1 * valor2;
		
		System.out.println("PROD = " + prod);
		
		sc.close();

	}
}
