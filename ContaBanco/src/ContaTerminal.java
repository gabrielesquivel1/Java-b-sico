import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner Terminal = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            int numero = Terminal.nextInt(); // Reading user input (account number)
            
            System.out.println("Digite o número da agência: ");
            String agencia = Terminal.next();
            
            
            System.out.println("Digite o nome do cliente: ");
            String nome = Terminal.next(); // Reading user input (Client name)

            System.out.println("Saldo : ");
            Double saldo = Terminal.nextDouble(); // Reading user input (Balance)

            System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }


    }
}
