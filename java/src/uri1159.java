import java.util.Scanner;

public class uri1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, cont = 0;
		int valor = sc.nextInt();

		while (valor != 0) {
			cont = 0;
			soma = 0;
			while (cont < 5) {
				if (valor % 2 == 0) {
					soma += valor;
					cont++;
				}
				valor++;
			}
			System.out.println(soma);
			valor = sc.nextInt();
		}

		sc.close();
	}

}
