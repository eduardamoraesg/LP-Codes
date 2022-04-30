/* 16. Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.
A formula de conversão é: C = P ∗ 2, 54, sendo C o comprimento em centímetros e P o
comprimento em polegadas.*/
package lp;
import java.util.Scanner;
public class PolCm {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite o valor em polegadas:");
 // p = polegadas.   
    double p = in.nextDouble();
// cm = centímetros.
    double cm = p*2.54;
    System.out.printf("A conversão de %.2f polegadas em centímetros é igual a %.2fcm.", p, cm);
    }
}
