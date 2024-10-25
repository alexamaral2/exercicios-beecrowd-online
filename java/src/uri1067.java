import java.util.Scanner;

public class uri1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (N >= 1 && N <= 1000) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}

	}

}
