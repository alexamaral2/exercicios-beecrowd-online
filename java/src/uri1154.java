import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int somaIdade = 0;
		int contIdade = 0;

		while (idade >= 0) {
			if (idade >= 0) {
				somaIdade += idade;
				contIdade++;
			}
			idade = sc.nextInt();
		}

		if (contIdade > 0) {
			double media = (double) somaIdade / contIdade;
			System.out.printf("%.2f%n", media);
		}

		sc.close();
	}
}