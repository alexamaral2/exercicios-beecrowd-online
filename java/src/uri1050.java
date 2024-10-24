import java.util.Scanner;

public class uri1050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dd = sc.nextInt();
        String msg;
        
        if (dd == 61) {
            msg = "Brasilia";
        } else if (dd == 71) {
            msg = "Salvador";
        } else if (dd == 11) {
            msg = "Sao Paulo";
        } else if (dd == 21) {
            msg = "Rio de Janeiro";
        } else if (dd == 32) {
            msg = "Juiz de Fora";
        } else if (dd == 19) {
            msg = "Campinas";
        } else if (dd == 27) {
            msg = "Vitoria";
        } else if (dd == 31) {
            msg = "Belo Horizonte";
        } else {
            msg = "DDD nao cadastrado";
        }
        
        System.out.println(msg);
        sc.close(); 
    }
}
