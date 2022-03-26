// Média Aritmética de três números.
import java.util.Scanner;
public class MedAritmetica {
    private static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = in.nextDouble();
        // n1 = primeiro número
        System.out.println("Digite o segundo número: ");
        double n2 = in.nextDouble();
        // n2 = segundo número
        System.out.println("Digite o terceiro número: ");
        double n3 = in.nextDouble();
        // n3 = terceiro número
        double m = n1+n2+n3;
        // m = média aritmética entre os números
        System.out.printf("A média aritmética entre os números informados é: %.2f.", m);
    }
}
