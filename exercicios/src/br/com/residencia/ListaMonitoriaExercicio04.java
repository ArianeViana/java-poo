package br.com.residencia;

import java.util.Scanner;

public class ListaMonitoriaExercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Digite um n�mero: ");
		numero = scan.nextInt();
		scan.close();
		
		if (numero % 2 == 0) {
			System.out.println("Seu n�mero � par.");
		} else {
			System.out.println("Seu n�mero � �mpar.");
		}

	}

}
