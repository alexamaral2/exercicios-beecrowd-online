import java.util.Scanner;

public class uri1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int temp;
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}

		for (int i = x; i <= y; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);

		sc.close();
	}

}
