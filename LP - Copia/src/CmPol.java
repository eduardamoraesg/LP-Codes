/*Leia um valor de comprimento em centímetros e apresente-o convertido em polegadas.
A fórmula de conversão é: P = C/2,54 , sendo C o comprimento em centímetros e P ocomprimento em polegadas.*/
package lp;
import java.util.Scanner;
public class CmPol {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite um valor em centímetros: ");
// cm = centímetros.
    double cm = in.nextDouble();
// p = polegadas.
    double p = cm/2.54;
    System.out.printf("A conversão de %.2fcm em polegadas é igual a %.2f.", cm, p);
    }   
}
