// Converter velocidade de m/s em km/h.
package lp;
import java.util.Scanner;
public class MsKm {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite a velocidade em m/s: ");
    double ms = in.nextDouble();
// conv = conversão.
    double conv = ms*3.6;
    System.out.printf("A conversão da velocidade de %.2fm/s é igual a %.2fkm/h.", ms, conv);
    }
}