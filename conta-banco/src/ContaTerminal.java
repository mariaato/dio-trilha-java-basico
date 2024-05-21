import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da agência: ");
        int numero = scanner.nextInt();  
        
        System.out.println("Digite a agência: ");
        String agencia = scanner.next();  

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário
        System.out.println("Ola " + nome );
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "conta " + numero);
        System.out.println("e seu saldo é " + saldo);
        
        // fechando o scanner
        scanner.close();
    }
}
