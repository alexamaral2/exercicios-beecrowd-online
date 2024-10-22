import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor = sc.next();
		double salarioFixo = sc.nextDouble();
		double montanteVendas = sc.nextDouble();
		
		double totalReceber = salarioFixo + (montanteVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
		
		sc.close();
	}

}
