import java.util.Scanner;

public class Antecessor {
    private static Scanner in;

    public static void main(String[] args) {
    in = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n1 = in.nextInt();
    int ant = n1 - 1;
    System.out.printf("O antecessor de %d é %d", n1, ant);
    }
}
