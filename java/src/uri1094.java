import java.util.Locale;
import java.util.Scanner;

public class uri1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int totalCobaias = 0;
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;

		for (int i = 0; i < n; i++) {
			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);

			totalCobaias += quantia;

			switch (tipo) {
			case 'C':
				totalCoelhos += quantia;
				break;
			case 'R':
				totalRatos += quantia;
				break;
			case 'S':
				totalSapos += quantia;
				break;
			}
		}

		double percentualCoelhos = (totalCoelhos * 100.0) / totalCobaias;
		double percentualRatos = (totalRatos * 100.0) / totalCobaias;
		double percentualSapos = (totalSapos * 100.0) / totalCobaias;

		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);

		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

		sc.close();
	}
}
