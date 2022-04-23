/*15. Leia um ângulo em radianos e apresente-o convertido em graus. A fórmula de conversão
é: G = R ∗ 180/π, sendo G o ângulo em graus e R em radianos e π = 3.14.*/
package lp;
import java.util.Scanner;
public class RadGraus {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite o valor de um ângulo em radianos: ");
    double rad = in.nextDouble();
    double pi = 3.14;
    double ang = (rad*180)/pi;
    System.out.printf("O ângulo em radianos convertido em graus é igual a: %.2f", ang);
    }
}
