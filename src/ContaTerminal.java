import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Instância da classe
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Para uma conta de banco é necessário as seguintes informações...
        // Número - Agencia - Nome do Cliente - Saldo

        // Exibe a seguinte mensagem abaixo para o usuário:
        System.out.println("Por favor, informe seu número da conta: ");

        // Armazena o valor int
        int numero = scanner.nextInt();

        // Exibe a seguinte mensagem abaixo para o usuário:
        System.out.println("Informe sua agência: ");

        // Armazena o valor string
        String agencia = scanner.next();

        // Exibe a seguinte mensagem abaixo para o usuário:
        System.out.println("Informe seu nome: ");

        // Armazena o valor string
        String nomeDoCliente = scanner.next();

        // Exibe a seguinte mensagem abaixo para o usuário:
        System.out.println("Informe seu saldo: ");

        // Armazena o valor string
        double saldo = scanner.nextDouble();


        // Exibe a seguinte mensagem abaixo para o usuário:
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.", nomeDoCliente, agencia, numero, saldo));

        scanner.close();


    }
}
