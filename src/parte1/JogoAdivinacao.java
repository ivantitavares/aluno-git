package parte1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int numeroRecebido = 0;


        for (int i = 1; i <= 5 ; i++) {
            System.out.println(String.format("Tentativa %d: Digite um número de 0 a 100!", i) );
            numeroRecebido = leitura.nextInt();
            if (numeroRecebido < aleatorio){
                System.out.println("Errado, o número é maior!");
            } else if (numeroRecebido > aleatorio){
                System.out.println("Errado! o número é menor..");
            }
            if (numeroRecebido == aleatorio){
                System.out.println("Acertou!");
                break;
            }
        }
        System.out.println("O Correto era: " + aleatorio);
    }
}
