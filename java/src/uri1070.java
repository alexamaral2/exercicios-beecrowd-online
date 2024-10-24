import java.util.Scanner;

public class uri1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		int qtdImpares = 6;
		
		int valor = sc.nextInt();

		while (cont < qtdImpares) {
			if (valor % 2 != 0) {
				System.out.println(valor);
				cont++;
			}
			valor++;
		}

		sc.close();
	}
}
