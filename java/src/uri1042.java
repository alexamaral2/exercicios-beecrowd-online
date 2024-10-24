import java.util.Scanner;

public class uri1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1, val2, val3;
        
        val1 = sc.nextInt();
        val2 = sc.nextInt();
        val3 = sc.nextInt();
        
        int originalVal1 = val1;
        int originalVal2 = val2;
        int originalVal3 = val3;

        if (val1 > val2) {
            int temp = val2;
            val2 = val1;
            val1 = temp;
        }
        if (val1 > val3) {
            int temp = val3;
            val3 = val1;
            val1 = temp;
        }
        if (val2 > val3) {
            int temp = val3;
            val3 = val2;
            val2 = temp;
        }

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        
        System.out.println("");
        
        System.out.println(originalVal1);
        System.out.println(originalVal2);
        System.out.println(originalVal3);
        
        sc.close();
    }
}
