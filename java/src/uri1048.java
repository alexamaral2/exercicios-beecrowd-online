import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, reajuste, novoSalario, percentual;

        salario = sc.nextDouble();

        if (salario <= 400.00) {
            percentual = 15.00;

        } else if (salario <= 800.00) {  
            percentual = 12.00;

        } else if (salario <= 1200.00) {
            percentual = 10.00;

        } else if (salario <= 2000.00) {
            percentual = 7.00;

        } else {
            percentual = 4.00;
        }

        reajuste = salario * percentual / 100.0;
        novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f %%%n", percentual);

        sc.close();
    }
}
