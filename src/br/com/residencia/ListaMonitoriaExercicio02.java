package br.com.residencia;

import java.util.Scanner;

public class ListaMonitoriaExercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raio, area; 
				
		System.out.println("Digite o raio do círculo em cm: ");
		raio = scan.nextDouble();
		scan.close();
		area = Math.PI * (Math.pow(2, raio));
		
		System.out.format("A área do círculo é: = %.4f", area);
		System.out.print("cm²");	
		
		
		
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da area deste circulo com 
//		quatro casas decimais. Formula da area: area = pi . raio². Considere o valor de pi = 3.14159.
//		
		
	}

}
//Faca um programa para ler o valor do raio de um círculo, e
//depois mostrar o valor da área deste círculo com quatro casas decimais. 
//Fórmula da área: area = pi . raio². Considere o valor de pi = 3.14159.