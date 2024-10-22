import java.util.Locale;
import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, maiorAB, maiorABC;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		maiorAB = (A + B + Math.abs(A-B)) / 2;
		maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2; 
		
		System.out.println(maiorABC + " eh o maior");
		sc.close();
		
	}

}
