import java.util.Locale;
import java.util.Scanner;

public class uri1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double eixoX, eixoY;

		eixoX = sc.nextDouble();
		eixoY = sc.nextDouble();

		if (eixoX > 0 && eixoY > 0) {
			System.out.println("Q1");
		} else if (eixoX < 0 && eixoY > 0) {
			System.out.println("Q2");
		} else if (eixoX < 0 && eixoY < 0) {
			System.out.println("Q3");
		} else if (eixoX > 0 && eixoY < 0) {
			System.out.println("Q4");
		} else if (eixoX == 0 && eixoY == 0) {
			System.out.println("Origem");
		} else if (eixoX == 0) {
			System.out.println("Eixo Y");
		} else if (eixoY == 0) {
			System.out.println("Eixo X");
		}
	}
}
