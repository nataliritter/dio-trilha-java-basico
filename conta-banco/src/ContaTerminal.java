import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 0.0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Por favor, digite o saldo: ");
                saldo = scanner.nextDouble();
                inputValid = true; // A entrada é válida, sair do loop
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar um número válido.");
                scanner.nextLine(); // Limpar o buffer do scanner e tentar novamente
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

