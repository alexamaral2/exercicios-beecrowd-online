import java.util.Scanner;

public class uri1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if((A + B > C) && (A + C > B) && (B + C > A)) {
			double p = A + B + C;
			System.out.printf("Perimetro = %.1f%n", p);
		} else {
			double area = ((A + B) * C) / 2.0;
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
	}

}
