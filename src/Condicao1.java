public class Condicao1 {
    public static void main (String[] args){
        // testando Text Blocks
        String mensagem = """
                            Olá,
                            Essa mensagem é importante!
                            Não coloque uma senha fraca!
                            """;
        System.out.println(mensagem);
        String senha = "123456";
        if (senha.equals("123456")){
            System.out.println("Acesso Autorizado");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
