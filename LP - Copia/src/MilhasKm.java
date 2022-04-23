/*13. Leia uma distância em quilômetros e apresente-a convertida em milhas. A fórmula de
conversão é: M = K 1,61 , sendo K a distância em quilômetros e M em milhas.*/
package lp;
import java.util.Scanner;
public class MilhasKm {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite a distância em quilômetros: ");
    double km = in.nextDouble();
// conv = conversão.
    double conv = km/1.61;
    System.out.printf("A conversão de %.2f km para milhas é igual a %.2f", km, conv);
    }
}