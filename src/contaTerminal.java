import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {   
        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo!!");
        System.out.println("Informe seu nome");
        String name = s.nextLine();    
        System.out.println("Informe sua agencia");
        int agencia = s.nextInt();
        System.out.println("Informe sua conta");
        int conta = s.nextInt();
        System.out.println("Informe o saldo");
        double saldo = s.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque");

    }
}
