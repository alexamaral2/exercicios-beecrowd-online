import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		
		double distancia = velocidade * tempo;
		double litros = distancia / 12; 
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
