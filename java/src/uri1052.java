import java.util.Scanner;

public class uri1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        String msg;
        
        if (month == 1) {
            msg = "January";
        } else if (month == 2) {
            msg = "February";
        } else if (month == 3) {
            msg = "March";
        } else if (month == 4) {
            msg = "April";
        } else if (month == 5) {
            msg = "May";
        } else if (month == 6) {
            msg = "June";
        } else if (month == 7) {
            msg = "July";
        } else if (month == 8) {
            msg = "August";
        } else if (month == 9) {
            msg = "September";
        } else if (month == 10) {
            msg = "October";
        } else if (month == 11) {
            msg = "November";
        } else if (month == 12) {
            msg = "December";
        } else {
            msg = "Invalid month";
        }
        
        System.out.println(msg);
        sc.close(); 
    }
}
