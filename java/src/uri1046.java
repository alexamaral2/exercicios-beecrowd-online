import java.io.IOException;
import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
	}

}