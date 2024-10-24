import java.util.Scanner;

public class uri1131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vitoriasInter = 0, vitoriasGremio = 0, empates = 0, totalGrenais = 0;
		int repetir = 1;

		while (repetir == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				vitoriasInter++;
			} else if (golsGremio > golsInter) {
				vitoriasGremio++;
			} else {
				empates++;
			}

			totalGrenais++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			repetir = sc.nextInt();
		}

		System.out.println(totalGrenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();
	}
}
