package ContaBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputDadosDaConta = new Scanner(System.in);

        System.out.println("Qual o titular da conta?");
        String titularConta = inputDadosDaConta.nextLine();

        System.out.println("Qual o número da conta?");
        String numeroConta = inputDadosDaConta.nextLine();

        System.out.println("Qual a agência?");
        int agencia = inputDadosDaConta.nextInt();

        System.out.println("Qual o saldo da conta?");
        double saldo = inputDadosDaConta.nextDouble();

        System.out.println("===================================");
        System.out.println("Titular da Conta: " + titularConta);
        System.out.println("Número da Conta " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
}
