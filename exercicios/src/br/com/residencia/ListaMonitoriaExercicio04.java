package br.com.residencia;

import java.util.Scanner;

public class ListaMonitoriaExercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		scan.close();
		
		if (numero % 2 == 0) {
			System.out.println("Seu número é par.");
		} else {
			System.out.println("Seu número é ímpar.");
		}

	}

}
