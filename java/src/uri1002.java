import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double raio, area;
		
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}

}
