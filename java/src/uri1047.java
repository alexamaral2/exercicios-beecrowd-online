import java.util.Locale;
import java.util.Scanner;

public class uri1047 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, tInicio, tFim, duracao;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        tInicio = (horaInicial * 60) + minutoInicial;
        tFim = (horaFinal * 60) + minutoFinal;

        if (tFim > tInicio) {
            duracao = tFim - tInicio;
        } else {
            duracao = (24 * 60 - tInicio) + tFim;
        }

        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
