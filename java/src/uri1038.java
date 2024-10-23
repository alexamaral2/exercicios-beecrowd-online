import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double preco;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			preco = quantidade * 4.00;
		} else if (codigo == 2) {
			preco = quantidade * 4.50;
		} else if (codigo == 3) {
			preco = quantidade * 5.00;
		} else if (codigo == 4) {
			preco = quantidade * 2.00;
		} else {
			preco = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", preco);

		sc.close();
	}

}
