
package piramide;

import java.util.Scanner;


public class Piramide {
    
     int i, j, k, num;
    Scanner user;
    public Piramide ()
            
    {
        
        user = new Scanner(System.in);
        System.out.print("Numero de piarmide :");
        num = user.nextInt();
                   for (i = 1; i <= num; i++) {
                for (j = i; j < num; j++) {
                    System.out.print(" ");
                }

                for (k = 1; k < (i * 2); k++) {
                    System.out.print("*");
                }
                System.out.print("\n");

            }

    }

    public static void main(String[] args) {
        Piramide obj = new Piramide();
    }

}
