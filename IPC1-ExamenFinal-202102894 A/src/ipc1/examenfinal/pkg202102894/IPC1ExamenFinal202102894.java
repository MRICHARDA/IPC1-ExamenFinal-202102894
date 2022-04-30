
package ipc1.examenfinal.pkg202102894;

import java.util.Scanner;


public class IPC1ExamenFinal202102894 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Evaluador de Numeros------");
        System.out.println("Ingrese la cantidad de numeros por favor: ");
        int cantidadNumeros = scanner.nextInt();

        int numeroMenor = 0;
        int numeroMayor = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Digite el número en la posición " + (i + 1));
            int num = scanner.nextInt();
            if (i == 0) {
                numeroMenor = num;
                numeroMayor = num;
                
            } else if (num < numeroMenor) {
                numeroMenor = num;
                
            }
             if (num>numeroMayor) {
                numeroMayor=num;
           }

        }
        System.out.println("El número menor es " + numeroMenor);
        System.out.println("El número mayor es " + numeroMayor);
  
    }
}


