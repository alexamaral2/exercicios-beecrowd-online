import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int numFuncionario, numHoraTrabalhada;
		double valorHoraTrabalhada, salario;
		
		numFuncionario = sc.nextInt();
		numHoraTrabalhada = sc.nextInt();
		valorHoraTrabalhada = sc.nextDouble();
		
		salario = numHoraTrabalhada * valorHoraTrabalhada;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
