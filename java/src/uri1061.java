import java.util.Scanner;

public class uri1061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int W1 = sc.nextInt();
		int X1 = sc.nextInt();
		s = sc.next();
		int Y1 = sc.nextInt();
		s = sc.next();
		int Z1 = sc.nextInt();

		s = sc.next();
		int W2 = sc.nextInt();
		int X2 = sc.nextInt();
		s = sc.next();
		int Y2 = sc.nextInt();
		s = sc.next();
		int Z2 = sc.nextInt();

		int inicioSegundos = (W1 * 24 * 60 * 60) + (X1 * 60 * 60) + (Y1 * 60) + Z1;
		int fimSegundos = (W2 * 24 * 60 * 60) + (X2 * 60 * 60) + (Y2 * 60) + Z2;

		int duracaoSegundos = fimSegundos - inicioSegundos;

		int dias = duracaoSegundos / (24 * 60 * 60);
		duracaoSegundos %= (24 * 60 * 60);
		int horas = duracaoSegundos / (60 * 60);
		duracaoSegundos %= 3600;
		int minutos = duracaoSegundos / 60;
		int segundos = duracaoSegundos % 60;

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

		sc.close();
	}
}
