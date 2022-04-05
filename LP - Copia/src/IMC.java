// Dois valores(peso e altura) e calcular o Índice de Massa Corporal com base na fórmula.
import java.util.Scanner;
public class IMC {
    private static Scanner in;

    public static void main(String[] args){
    in = new Scanner(System.in);
    System.out.println("Informe seu peso: ");
    double peso = in.nextDouble();
    System.out.println("Informe sua altura: ");
    double alt = in.nextDouble();
    // IMC = Índice de massa corporal.
    double IMC = (peso/(alt*alt));
    // Se:
        if(IMC<=18.5){
        System.out.println("Abaixo do peso.");
        } if((18.5<IMC && IMC<=25)){
        System.out.println("Peso normal.");
        } if((25<=IMC && IMC<=30)){
        System.out.println("Acima do peso.");
        // Outro:
        } if(30<IMC){
        System.out.println("Obeso.");
        }
    }
    
}