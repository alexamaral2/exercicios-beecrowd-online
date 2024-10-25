import java.util.Scanner;

public class uri1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m, n;

		do {
			m = sc.nextInt();
			n = sc.nextInt();

			if (m > 0 && n > 0) {
				int menor = Math.min(m, n);
				int maior = Math.max(m, n);

				int soma = 0;
				for (int i = menor; i <= maior; i++) {
					soma += i;
					System.out.print(i + " ");
				}
				System.out.println("Sum=" + soma);
			}

		} while (m > 0 && n > 0);

		sc.close();
	}
}
