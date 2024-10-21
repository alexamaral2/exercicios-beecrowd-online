import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double valPagar;
		
		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valUniPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valUniPeca2 = sc.nextDouble();
		
		valPagar = (numPeca1 * valUniPeca1) + (numPeca2 * valUniPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valPagar);
		
		sc.close();
	}

}
