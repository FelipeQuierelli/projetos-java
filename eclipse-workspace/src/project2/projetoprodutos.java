package project2;

import java.util.Scanner;

public class projetoprodutos {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = s1.nextLine();

        System.out.print("Preço do produto: ");
        double preco = s1.nextDouble();

        System.out.print("Quantidade do produto: ");
        int quantidade = s1.nextInt();

        Produto1 p1 = new Produto1(nome, preco, quantidade);
        System.out.println();
        s1.nextLine();

        System.out.print("Nome do produto: ");
        String nome2 = s1.nextLine();

        System.out.print("Preço do produto: ");
        double preco2 = s1.nextDouble();

        System.out.print("Quantidade do produto: ");
        int quantidade2 = s1.nextInt();

        Produto2 p2 = new Produto2(nome2, preco2, quantidade2);
        System.out.println();
        System.out.print("Desconto: ");
        double desconto = s1.nextDouble();
        Desconto d1 = new Desconto(desconto);
        d1.novoPreco(preco2, preco);
    }
}

class Produto1{
    String nome;
    double preco;
    int quantidade;
    Produto1(){
        this.nome = "indefinido";
        this.preco = 0;
        this.quantidade = 0;
    }
    Produto1(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

class Produto2{
    String nome2;
    double preco2;
    int quantidade2;
    double desconto;
    
    Produto2(){
        this.nome2 = "indefinido";
        this.preco2 = 0;
        this.quantidade2 = 0;
    }
    Produto2(String nome2, double preco2, int quantidade2){
        this.nome2 = nome2;
        this.preco2 = preco2;
        this.quantidade2 = quantidade2;
    }
}

class Desconto {
    double desconto;
    
    Desconto(){
        this.desconto = 0;
    }
    
    Desconto(double desconto){
        this.desconto = desconto;
    }
    
    double calcularDesconto(){
        return desconto / 100;
    }

    void novoPreco(double preco2, double preco1){
        double descontoDecimal = calcularDesconto();
        double preco1ComDesconto = preco1 - (preco1 * descontoDecimal);
        double preco2ComDesconto = preco2 - (preco2 * descontoDecimal);
        System.out.println("O preço1 com desconto é: " + preco1ComDesconto);
        System.out.println("O preço2 com desconto é: " + preco2ComDesconto);
    }
}
