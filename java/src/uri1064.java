import java.util.Scanner;

public class uri1064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contPositivo = 0;
        double soma = 0.0;
        double media = 0.0;
        
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();
        double val3 = sc.nextDouble();
        double val4 = sc.nextDouble();
        double val5 = sc.nextDouble();
        double val6 = sc.nextDouble();
        
        if (val1 > 0.0) {
            contPositivo++;
            soma += val1;
        }
        if (val2 > 0.0) {
        	contPositivo++;
        	soma += val2;
        }
        if (val3 > 0.0) {
        	contPositivo++;
        	soma += val3;
        }
        if (val4 > 0.0) {
        	contPositivo++;
        	soma += val4;
        }
        if (val5 > 0.0) {
        	contPositivo++;
        	soma += val5;
        }
        if (val6 > 0.0) {
        	contPositivo++;
        	soma += val6;
        }
     
        if (soma > 0.0) {
        	media = soma / contPositivo;
        }
        
        System.out.println(contPositivo + " valores positivos");
        System.out.printf("%.1f%n", media);
        sc.close(); 
    }
}
