package br.com.residencia;

import java.util.Scanner;

public class ListaMonitoriaExercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raio, area; 
				
		System.out.println("Digite o raio do c�rculo em cm: ");
		raio = scan.nextDouble();
		scan.close();
		area = Math.PI * (Math.pow(2, raio));
		
		System.out.format("A �rea do c�rculo �: = %.4f", area);
		System.out.print("cm�");	
		
		
		
//		Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da area deste circulo com 
//		quatro casas decimais. Formula da area: area = pi . raio�. Considere o valor de pi = 3.14159.
//		
		
	}

}
//Faca um programa para ler o valor do raio de um c�rculo, e
//depois mostrar o valor da �rea deste c�rculo com quatro casas decimais. 
//F�rmula da �rea: area = pi . raio�. Considere o valor de pi = 3.14159.