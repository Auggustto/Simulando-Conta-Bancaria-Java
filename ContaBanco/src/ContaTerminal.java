
import java.util.Scanner;

public class ContaTerminal {

    private double saldo = 25;
    
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao seu terminal de saque eletrônico!");

        System.out.println("Insira o valor para saque:");
        double valorSolicitado = sc.nextDouble();
        
        if (conta.saldo >= valorSolicitado){
                conta.sacar(valorSolicitado);
                System.out.println("Saque realizado com sucesso!");
                System.out.printf("Saldo disponível: R$ %.2f%n", conta.saldo);
            } 
            else {
                System.out.printf("Saldo insuficiente: R$ %.2f%n", conta.saldo);
            }
            sc.close();
    }

    public void sacar(double valorSolicitado){
        
        saldo -= valorSolicitado;
    }
}
