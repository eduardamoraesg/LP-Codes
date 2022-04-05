// Quociente entre dois números e o resto da divisão.
import java.util.Scanner;
public class QuocienteResto {
    private static Scanner in;
    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int x = in.nextInt();
// X = Primeiro número.
    System.out.println("Digite outro número: ");
    int y = in.nextInt();
// Y = Segundo número.
    int d = x/y;
// D = Divisão.
    int resto = x%y;
// Resto = Resto da divisão.
    System.out.printf("A divisão entre %d e %d é igual a %d, tendo um resto igual a %d.", x, y, d, resto);
    }
}
