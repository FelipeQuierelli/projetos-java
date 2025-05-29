package project2;

import java.util.Scanner;

public class poo2 {
    public static void main(String[] args) {
        // Criando duas pessoas com o construtor
        Scanner s1 = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = s1.nextLine();

        System.out.print("Idade: ");
        int idade = s1.nextInt();
        s1.nextLine(); // Consumir a linha vazia
        // Chamando os métodos
        Pessoa p1 = new Pessoa(nome,idade);
        p1.apresentar();
        p1.fazerAniversario();

        System.out.println();
        System.out.print("Nome: ");
        String nome2 = s1.nextLine();
        
        System.out.print("Idade: ");
        int idade2 = s1.nextInt();

        System.out.println(); // apenas para espaçar a saída
        Pessoa2 p2 = new Pessoa2(nome2,idade2);
        p2.apresentar2();
    }
}

// Classe Pessoa correta
class Pessoa {
    String nome;
    int idade;
    Pessoa(){
        this.nome = "indefinido";
        this.idade = 0;
    }
    // Construtor
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    void fazerAniversario() {
        idade++;
        System.out.println(nome + " fez aniversário! Agora tem " + idade + " anos.");
    }
}

class Pessoa2 {
    String nome2;
    int idade2;
    Pessoa2(){
        this.nome2 = "indefinido";
        this.idade2 = 0;
    }
    // Construtor
    Pessoa2(String nome2, int idade2) {
        this.nome2 = nome2;
        this.idade2 = idade2;
    }
    void apresentar2(){
        System.out.println("Olá, meu nome é " + nome2 + " e tenho " + idade2 + " anos.");
    }
}