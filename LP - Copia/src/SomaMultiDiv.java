// Ler dois valores reais, calcular e imprimir na tela: Soma, Multiplicação e Divisão.
import java.util.Scanner;
public class SomaMultiDiv {
    private static Scanner in;
    public static void main(String[] args) {
    in = new Scanner(System.in);
    System.out.println("Informe dois valores: ");
    double n1 = in.nextDouble();
    // n1 = primeiro número
    double n2 = in.nextDouble();
    // n2 = segundo número
    double s = n1+n2;
    // s = Soma
    double m = n1*n2;
    // m = Multiplicação
    double d = n1/n2;
    // d = Divisão
    System.out.printf("A soma entre eles é igual a: %.2f. O produto é igual a: %.2f. E o quociente é igual a: %.2f.", s, m, d);
    }
}
