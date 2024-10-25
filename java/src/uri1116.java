import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y != 0) {
				double divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();

	}

}
