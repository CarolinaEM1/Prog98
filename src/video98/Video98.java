
package video98;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int matriz1[][],matriz2[][],suma[][];
       
       matriz1 = new int[3][3];
       matriz2 = new int[3][3];
       
       System.out.println("Digite la matriz 1");
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("Matriz1 ["+i+"]["+j+"]: ");
                matriz1[i][j] = teclado.nextInt();
        }
    }
       
    System.out.println("Digite la matriz 2");
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("Matriz2 ["+i+"]["+j+"]: ");
                matriz2[i][j] = teclado.nextInt();
        }
    }
       
    
    // Sumamos las matrices
    
    suma = new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            suma[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }
    
    System.out.println("\nLa suma de las matrices queda: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(suma[i][j]+" ");
                
            }
            System.out.println("");
    }
       
       
       
       
    }
    
}
