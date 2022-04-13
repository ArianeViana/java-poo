package br.com.residencia;

import java.util.Scanner;

public class Aula02Exercicio02 {
	
	public static void main(String[] args) {
		int numero1, numero2, soma;
		Scanner operacao = new Scanner(System.in);
		System.out.println("Escreva um número: ");
		numero1 = operacao.nextInt();
		System.out.println("Escreva outro número: ");
		numero2 = operacao.nextInt();
		soma = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " com " + numero2 + " é: " + soma);
		operacao.close();
		
	}
}
