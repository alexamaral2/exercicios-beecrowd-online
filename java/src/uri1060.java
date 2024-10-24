import java.util.Scanner;

public class uri1060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contPositivo = 0;
        
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();
        double val3 = sc.nextDouble();
        double val4 = sc.nextDouble();
        double val5 = sc.nextDouble();
        double val6 = sc.nextDouble();
        
        if (val1 > 0.0) {
            contPositivo++;
        }
        if (val2 > 0.0) {
        	contPositivo++;
        }
        if (val3 > 0.0) {
        	contPositivo++;
        }
        if (val4 > 0.0) {
        	contPositivo++;
        }
        if (val5 > 0.0) {
        	contPositivo++;
        }
        if (val6 > 0.0) {
        	contPositivo++;
        }
        
        System.out.println(contPositivo + " valores positivos");
        sc.close(); 
    }
}
