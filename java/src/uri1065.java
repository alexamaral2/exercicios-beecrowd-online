import java.util.Scanner;

public class uri1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        int val4 = sc.nextInt();
        int val5 = sc.nextInt();

        int contPar = 0;
        int contImpar = 0;
        int contPositivo = 0;
        int contNegativo = 0;

        if (val1 % 2 == 0) {
            contPar++;
        } else {
            contImpar++;
        }
        if (val1 > 0) {
            contPositivo++;
        } else if (val1 < 0) {
            contNegativo++;
        }

        if (val2 % 2 == 0) {
            contPar++;
        } else {
            contImpar++;
        }
        if (val2 > 0) {
            contPositivo++;
        } else if (val2 < 0) {
            contNegativo++;
        }

        if (val3 % 2 == 0) {
            contPar++;
        } else {
            contImpar++;
        }
        if (val3 > 0) {
            contPositivo++;
        } else if (val3 < 0) {
            contNegativo++;
        }

        if (val4 % 2 == 0) {
            contPar++;
        } else {
            contImpar++;
        }
        if (val4 > 0) {
            contPositivo++;
        } else if (val4 < 0) {
            contNegativo++;
        }

        if (val5 % 2 == 0) {
            contPar++;
        } else {
            contImpar++;
        }
        if (val5 > 0) {
            contPositivo++;
        } else if (val5 < 0) {
            contNegativo++;
        }

        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");

        sc.close();
    }
}
