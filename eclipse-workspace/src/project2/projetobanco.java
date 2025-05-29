package project2;
import java.util.Scanner;
public class projetobanco {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome = s1.nextLine();

        System.out.print("Numero da conta: ");
        int numero = s1.nextInt();

        Conta c1 = new Conta(nome, numero);
        System.out.print("Valor a ser depositado: ");
        double valor = s1.nextDouble();
        c1.depositar(valor);

        System.out.println("Nome: " + c1.nome);
        System.out.print("Valor a ser sacado: ");
        double valor2 = s1.nextDouble();
        c1.sacar(valor2);
        c1.mostrarSaldo();

        System.out.print("Valor a ser depositado: ");
        double valor3 = s1.nextDouble();
        c1.depositar(valor3);
        c1.mostrarSaldo();

    }
}

class Conta{
    String nome;
    int numero;
    double saldo;

    Conta(){
        this.nome = "indefinido";
        this.numero = 0;
    }

    Conta(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        this.saldo -= valor;
    }
    
    void mostrarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
        
}
