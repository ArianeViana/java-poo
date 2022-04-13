package br.com.residencia;

import java.util.Scanner;

public class Lista01Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float  temperaturaCelsius;
		double temperaturaFahrenheit;
		
		System.out.println("Qual é a temperatura em graus Celsius? ");
		temperaturaCelsius = leia.nextFloat();
		
		temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
		leia.close();
		
		
	
	

	}

}
