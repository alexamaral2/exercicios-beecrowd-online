import java.util.Locale;
import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int distancia = sc.nextInt();
		int tempo = distancia * 2;
		
		System.out.println(tempo + " minutos");
		
		sc.close();

	}

}
