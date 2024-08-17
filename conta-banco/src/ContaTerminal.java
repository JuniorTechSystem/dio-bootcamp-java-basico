import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero = 1021;
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        System.out.print("Por favor, digite o número da Agência! ");
        String agencia = sc.nextLine();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        
        sc.close();
        
    }
}
