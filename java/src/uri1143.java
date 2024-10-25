import java.util.Scanner;

public class uri1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int l1 = 0, l2 = 0;
		for (int i = 1; i <= n; i++) {
			l1 = i * i;
			l2 = l1 * i;

			System.out.printf("%d %d %d%n", i, l1, l2);
		}
	}

}
