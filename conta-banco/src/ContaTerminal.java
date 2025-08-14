import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de sua agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá, %s. Obrigado por criar sua conta em nosso banco, sua agência é %s, conta %s e seu saldo de %s já está disponível para saque.", nome, agencia, conta, saldo);
        scanner.close();
    }

}
