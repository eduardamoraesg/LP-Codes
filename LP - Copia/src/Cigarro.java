// Calcular a quantidade de dinheiro gasta por um fumante.
import java.util.Scanner;
public class Cigarro {
    private static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);
        System.out.println("Há quantos anos você fuma?");
        int anos = in.nextInt();
        System.out.println("Quantos cigarros são fumados por dia?");
        double cig = in.nextDouble();
// Cig = cigarro
        System.out.println("Qual o custo de uma carteira?");
        double precoCart = in.nextDouble();
// Cart = carteira, 20 cigarros por carteira
        double dia = (cig*precoCart)/20;
        double total = dia*anos*365;
        System.out.printf("A quantidades de dinheiro gasta ao longo de %d anos é de R$%.1f", anos, total);

    }
}
