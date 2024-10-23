import java.util.Locale;
import java.util.Scanner;

public class uri1021 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double N = sc.nextDouble();
        int valor = (int) Math.round(N * 100);

        int notas100 = valor / 10000;
        valor = valor % 10000;

        int notas50 = valor / 5000;
        valor = valor % 5000;

        int notas20 = valor / 2000;
        valor = valor % 2000;

        int notas10 = valor / 1000;
        valor = valor % 1000;

        int notas5 = valor / 500;
        valor = valor % 500;

        int notas2 = valor / 200;
        valor = valor % 200;

        int moedas1 = valor / 100;
        valor = valor % 100;

        int moedas050 = valor / 50;
        valor = valor % 50;

        int moedas025 = valor / 25;
        valor = valor % 25;

        int moedas010 = valor / 10;
        valor = valor % 10;

        int moedas05 = valor / 5;
        valor = valor % 5;

        int moedas01 = valor;  

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

        sc.close();
    }

}
