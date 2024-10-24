import java.util.Locale;
import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int combustivel = sc.nextInt();
		int qtdAlcool = 0, qtdGasolina = 0, qtdDiesel = 0;

		while (combustivel != 4) {
			switch (combustivel) {
			case 1:
				qtdAlcool++;
				break;
			case 2:
				qtdGasolina++;
				break;
			case 3:
				qtdDiesel++;
				break;
			default:
				break;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Diesel: " + qtdDiesel);
		
		sc.close();
	}
}