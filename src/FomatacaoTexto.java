public class FomatacaoTexto {
    public static void main (String[] args){
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos de idade e hoje eu gastei %.2f", nome, idade, valor));
    }
}
