import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite o número da sua conta bancária: ");
        int contaBancaria = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da sua conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá," + name + " obrigado por criar uma conta em nosso banco, sua agência é, " + agencia + "conta" + contaBancaria + "e seu saldo" + saldoConta + "já está disponível para saque");
    }
}
