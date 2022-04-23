/*12. Leia uma distancia em milhas e apresente-a convertida em quilômetros. A fórmula de
conversão é: K = 1, 61 ∗ M, sendo K a distância em quilômetros e M em milhas. */
package lp;
import java.util.Scanner;
public class KmMilhas {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite a distância em milhas: ");
    double milhas = in.nextDouble();
// conv = conversão.
    double conv = milhas*1.61;
    System.out.printf("A conversão de %.2f milhas para km é igual a %.2f", milhas, conv);
    }
}