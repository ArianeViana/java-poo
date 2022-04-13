package br.com.residencia;

import java.util.Scanner;

public class Lista03Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cupons, pontos;
		
		System.out.println("=====Programa Fidelidade=====");
		System.out.println("Quantos cupons você tem? ");
		cupons = scan.nextInt();
		scan.close();
		
		pontos = cupons * 3;
		
		if(cupons > 0) {
			System.out.println("De acordo com os seus cupons, você tem " + pontos + " pontos no programa fidelidade.");
		}
		
		if(cupons == 0) {
			System.out.println("Você não tem nenhum ponto no nosso programa.");
		}
		
		if(cupons < 0) {
			System.out.println("Número inválido! Por favor tente novamente.");
		}

	}

}
