/* 14. Leia um angulo em graus e apresente-o convertido em radianos. A fÓrmula de conversão
é: R = G ∗ π/180, sendo G o angulo em graus e R em radianos e π = 3.14*/
package lp;
import java.util.Scanner;
public class GrausRad {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite o valor de um ângulo em graus: ");
    double ang = in.nextDouble();
    double pi = 3.14;
// Rad = radianos.
    double rad = (ang*pi)/180;
    System.out.printf("O ângulo convertido em radianos é igual a: %.2f rad.", rad);
    }
}
