import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        double temperaturaCelsius;
        System.out.println("Diga seu nome:");
        nome = scanner.nextLine();
        System.out.println("Quantos graus Celsius faz agora onde você estar?");
        temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8)+32;

        System.out.println( nome +", essa temperartura em Fahrenheit é: " + temperaturaFahrenheit);


    }
}
