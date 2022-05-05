package lp;
import java.util.Scanner;
public class SimNao {
    private static Scanner in;

    public static void main(String args[]){
         in = new Scanner(System.in);

        System.out.println("Digite uma letra (S ou N): ");
        char resposta;
        resposta = in.next().charAt(0);
        
        switch(resposta){
            case 'S': System.out.println("Sim."); break;
            case 'N': System.out.println("Não."); break;
            default: System.out.println("Erro.");
            }
        }
}
