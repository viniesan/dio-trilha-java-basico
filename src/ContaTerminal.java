import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e receber dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Consumir a linha pendente
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                         nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        scanner.close();
    }
}