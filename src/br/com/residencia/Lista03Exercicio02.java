package br.com.residencia;

import java.util.Scanner;

public class Lista03Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cupons, pontos;
		
		System.out.println("=====Programa Fidelidade=====");
		System.out.println("Quantos cupons voc� tem? ");
		cupons = scan.nextInt();
		scan.close();
		
		pontos = cupons * 3;
		
		if(cupons > 0) {
			System.out.println("De acordo com os seus cupons, voc� tem " + pontos + " pontos no programa fidelidade.");
		}
		
		if(cupons == 0) {
			System.out.println("Voc� n�o tem nenhum ponto no nosso programa.");
		}
		
		if(cupons < 0) {
			System.out.println("N�mero inv�lido! Por favor tente novamente.");
		}

	}

}
