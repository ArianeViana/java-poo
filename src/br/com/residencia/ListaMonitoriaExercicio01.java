package br.com.residencia;

import java.util.Scanner;

public class ListaMonitoriaExercicio01 {

	public static void main(String[] args) {
		// Fa�a um programa para ler dois valores inteiros, e depois mostrar no console 
		//a soma desses n�meros.
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2, soma;
		
		System.out.println("Digite um n�mero: ");
		numero1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		numero2 = scan.nextInt();
		scan.close();
		
		soma = numero1 + numero2;
		
		System.out.println("A soma de seus n�meros �: " + soma);
		
		

	}

}
