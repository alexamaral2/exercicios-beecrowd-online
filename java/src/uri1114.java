import java.util.Scanner;

public class uri1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputUsuario = sc.nextInt();
		int senhaCorreta = 2002;

		while (inputUsuario != senhaCorreta) {
			System.out.println("Senha Invalida");
			inputUsuario = sc.nextInt();

			if (inputUsuario == senhaCorreta) {
				System.out.println("Acesso Permitido");
			}
		}

		sc.close();
	}

}
