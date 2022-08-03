import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        float saldo;

        System.out.print("Por favor, digite o seu Nome: ");
        nomeCliente = dig.next();

        System.out.print("Por favor, digite o número da Agência: ");
        numeroAgencia = dig.next();

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = dig.nextInt();

        System.out.print("Por favor, informe o seu saldo: ");
        saldo = dig.nextFloat();

        System.out.println();
        System.out.println("Conta criada...");
        System.out.println();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}