package project2;

import java.util.Scanner;

public class forstruct {

	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		int numeros;
		while (i < j){
			numeros = i++;
			if(numeros == 5) {
				System.out.print("\n5 achado\n");
			}else {
			System.out.print(numeros);
			}
		}
		
		Scanner scam = new Scanner(System.in);
		
		System.out.print("\nEntre com um numero: ");
		int num = scam.nextInt();
		
		System.out.print("Entre com um maximo: ");
		int max = scam.nextInt();
		
		for(int k = num; i <= max; i++) {
			System.out.print(i + "\n");
		}
	}
	

}
