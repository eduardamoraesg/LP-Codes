package lp;
import java.util.Scanner;
public class DiaSemana {
    public static void main(String args[]){
    
        Scanner in = new Scanner(System.in);

        int diaSemana;

        System.out.println("Digite um dia da semana (1 a 7): ");
        diaSemana = in.nextInt();

        // Lógica de dias da semana:
        switch(diaSemana){
            case 1: System.out.println("Domingo."); break;
            case 2: System.out.println("Segunda-feira."); break;
            case 3: System.out.println("Terça-feira."); break;
            case 4: System.out.println("Quarta-feira."); break;
            case 5: System.out.println("Quinta-feira."); break;
            case 6: System.out.println("Sexta-feira."); break;
            case 7: System.out.println("Sábado."); break;
            default: System.out.println("Não é um dia da semana.");
        }
        // Lógica de dias úteis:
        switch(diaSemana){
            case 2: 
            case 3: 
            case 4:
            case 5:
            case 6: System.out.println("É um dia útil."); break;
            case 7:
            case 1: System.out.println("Não é um dia útil."); break;
            default: System.out.println("Não é um dia da semana.");

        }
    }
}
