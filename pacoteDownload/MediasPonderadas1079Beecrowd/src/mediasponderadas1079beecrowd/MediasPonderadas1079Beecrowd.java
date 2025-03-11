/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediasponderadas1079beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class MediasPonderadas1079Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        for (int c = 0; c <= N; c++) {
            float valor1 = teclado.nextFloat();
            float valor2 = teclado.nextFloat();
            float valor3 = teclado.nextFloat();
            float media = ((valor1*2) + (valor2*3) + (valor3*5))/(2+3+5);
            System.out.println(String.format("%.1f", media));
        }
    }
    
}
