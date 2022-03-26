//Área do retângulo
import java.util.Scanner;
public class ARetangulo {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Digite o valor da base do retângulo: ");
        double b = in.nextDouble();
        // b = Base do retângulo
        System.out.println("Digite o valor da altura do retângulo: ");
        double h = in.nextDouble();
        // h = Altura do retângulo
        double a = b*h;
        // a = Área do retângulo
        System.out.printf("O valor da área do retângulo é igual a %.2f.", a);
    }
}