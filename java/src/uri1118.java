import java.util.Scanner;

public class uri1118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean novoCalculo = true;

        while (novoCalculo) {
            double n1 = sc.nextDouble();

            while (n1 < 0 || n1 > 10) {
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }

            double n2 = sc.nextDouble();

            while (n2 < 0 || n2 > 10) {
                System.out.println("nota invalida");
                n2 = sc.nextDouble();
            }
            
            double media = (n1 + n2) / 2;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            int calcular = sc.nextInt();

            while (calcular != 1 && calcular != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                calcular = sc.nextInt();
            }

            if (calcular == 2) {
                novoCalculo = false;
            }
        }

        sc.close();
    }
}
