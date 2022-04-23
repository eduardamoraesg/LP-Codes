// Converter velocidade de km/h para m/s.
package lp;
import java.util.Scanner;
public class KmMs {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite a velocidade em km/h: ");
    double km = in.nextDouble();
// conv = conversão.
    double conv = km/3.6;
    System.out.printf("A conversão da velocidade de %.2fkm/h é igual a %.2fm/s.", km, conv);
    }
}
