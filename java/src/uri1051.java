import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double imposto = 0.0;

        if (valor <= 2000.0) {
            System.out.println("Isento");
        } else {
            if (valor > 2000.0 && valor <= 3000.0) {
                imposto += (valor - 2000.0) * 0.08;
            } else if (valor > 3000.0 && valor <= 4500.0) {
                imposto += (1000.0) * 0.08;
                imposto += (valor - 3000.0) * 0.18;
            } else if (valor > 4500.0) {
                imposto += (1000.0) * 0.08;
                imposto += (1500.0) * 0.18;
                imposto += (valor - 4500.0) * 0.28;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
