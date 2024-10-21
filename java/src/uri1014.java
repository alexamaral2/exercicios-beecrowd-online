import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int distanciaPercorrida = sc.nextInt();
		double consumoCombustivel = sc.nextDouble();
		
		double consumoMedio = distanciaPercorrida / consumoCombustivel;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();
	}

}
