import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float N1, N2, N3, N4, media, mediaFinal, exame;
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();

		media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10;

		if (media >= 7.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno aprovado.");

		} else if (media >= 5.0) {
			exame = sc.nextFloat();
			mediaFinal = (media + exame) / 2;
			
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f%n", exame);
	
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", mediaFinal);
		} else {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno reprovado.");

		}
	}
}
