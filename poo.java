package project2;

import java.util.Scanner;

public class poo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Insira o modelo: ");
		String modelo = s1.nextLine();
		
		System.out.print("Insira a cor: ");
		String cor = s1.nextLine();
		
		Carro meuCarro = new Carro(modelo,cor);
		//meuCarro.modelo = "Civic";
		//meuCarro.cor = "Preto";
		//meuCarro.velocidade = 0;
		
		System.out.print("Deseja acelerar?");
		String res = s1.nextLine();
		if(res.equalsIgnoreCase("sim")) {
			meuCarro.acelerar();
		}else {
			meuCarro.frear();
		}
		
		System.out.println(meuCarro.velocidade);
		System.out.println(meuCarro.modelo);
		
		System.out.println(meuCarro.cor);
		
		
		Carro carro1 = new Carro("Gol\n","preto");
		
		System.out.print(carro1.modelo);
		System.out.print(carro1.cor);

		// Criando mais exemplos de carros
		Carro carro2 = new Carro("Ferrari", "Vermelho");
		Carro carro3 = new Carro(); // Usando o construtor padrão
		
		// Testando aceleração múltipla
		System.out.println("\n=== Teste de Aceleração ===");
		System.out.println("Ferrari inicial: " + carro2.velocidade + "km/h");
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		System.out.println("Ferrari após 3 acelerações: " + carro2.velocidade + "km/h");
		
		// Testando frenagem
		System.out.println("\n=== Teste de Frenagem ===");
		carro2.frear();
		System.out.println("Ferrari após frear: " + carro2.velocidade + "km/h");
		
		// Mostrando carro com valores padrão
		System.out.println("\n=== Carro com Valores Padrão ===");
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Cor: " + carro3.cor);
		System.out.println("Velocidade: " + carro3.velocidade + "km/h");

	}
}
class Carro{
	String modelo;
	String cor;
	int velocidade;
	
	
	void acelerar() {
		velocidade += 10;
	}
	
	void frear() {
		velocidade -= 10;
		if(velocidade < 0) {
			velocidade = 0;
		}
	}
	
	Carro(){
		this.modelo = "indefinido";
		this.cor = "indefinida";
		this.velocidade = 0;
	}
	
	Carro(String modelo,String cor){
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade = 0;
	}
}

 