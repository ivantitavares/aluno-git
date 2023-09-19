import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Batman";
        String tipoConta = "Corrente";
        double saldo = 5999.98;
        int menu = 0;


        System.out.println("*********************");
        System.out.println("\nNome do Cliente: " + nome);  // o "\n" é pra pular linha
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Salto atual: " + saldo);
        System.out.println("\n*********************");
        String opcoes = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:""";

        while (menu != 4){
            System.out.println(opcoes);
            menu = leitura.nextInt();
            if (menu == 1){
                System.out.println("Seu saldo é: " + saldo);

            } else if (menu == 2) {
                System.out.println("Digite o valor a Receber:");
                saldo = saldo + leitura.nextDouble();
                System.out.println("Seu saldo atualizado é: " + saldo);

            } else if (menu == 3) {
                System.out.println("Digite o valor a Transferir:");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("\nERROR: Saldo insuficiente! - Por Favor Tente outra opção!\n");
                } else {
                    saldo -=valor;
                                    }
                System.out.println("Seu saldo atualizado é: " + saldo);
            } else if (menu != 4) {
                System.out.println("ERROR: Opção invalida, tente outra operação!");
            }


        }
    }
}
