import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int l1 = 1, l2 = 0, l3 = 0;
		for (int i = 1; i <= n; i++) {
			l2 = l1 + 1;
			l3 = l2 + 1;
			
			System.out.printf("%d %d %d PUM%n", l1, l2, l3);
			l1 += 4;
		}
	}

}
