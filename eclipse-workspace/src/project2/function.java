package project2;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		saudacao();
		int resultado = soma();
		System.out.print(resultado);

	}
	
	public static void saudacao() {
		System.out.print("Função funcionando\n");
	}
	
	
	public static int soma() {
		Scanner Scam = new Scanner(System.in);
		System.out.print("Escreva o primeiro numero: ");
		int a = Scam.nextInt();
		System.out.print("Escreva o segundo numero: ");
		int b = Scam.nextInt();
		return a + b;
	}
}
