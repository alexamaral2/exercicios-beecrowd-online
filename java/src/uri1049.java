import java.util.Scanner;

public class uri1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(); 
        String b = sc.nextLine(); 
        String c = sc.nextLine(); 

        if (a.equals("vertebrado")) {
            if (b.equals("mamifero")) {
                if (c.equals("onivoro")) {
                    System.out.println("homem");
                } else if (c.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            } else if (b.equals("ave")) {
                if (c.equals("onivoro")) {
                    System.out.println("pomba");
                } else if (c.equals("carnivoro")) {
                    System.out.println("aguia");
                }
            }
        } else if (a.equals("invertebrado")) {
            if (b.equals("inseto")) {
                if (c.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (c.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (b.equals("anelideo")) {
                if (c.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (c.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close(); 
    }
}
