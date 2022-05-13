package br.com.residencia;

import java.util.Scanner;

public class ListaMonitoriaExercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número entre 1 e 1000");
		numero = scan.nextInt();
		scan.close();
		
		for (int i = 1 ; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
