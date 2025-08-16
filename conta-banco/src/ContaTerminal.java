import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        var scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário

        System.out.println("Informe o seu nome:");
        var nome = scanner.next();
        System.out.println("Informe a sua agencia:*ex: 067-8*");
        var agencia = scanner.next();
        System.out.println("Informe o numero da sua conta: *ex: 1021*");
        var conta = scanner.nextInt();
        var saldo =  (float) 692.71;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$ %s já está disponível para saque. \n", nome, agencia, conta, saldo);


        //Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem de conta criada
    }
}
