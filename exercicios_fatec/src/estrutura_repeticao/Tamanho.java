/*
	Nome do programa: Tamanho
	Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
	Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
	e cresce 2 cm ao ano.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 43
*/

package estrutura_repeticao;

public class Tamanho {

	public static void main(String[] args) {
		double maria, ana, i=0;
		
		maria = 1.10;
		ana = 1.50;
		
		while (maria < ana) {
			
			maria = maria + 0.03;
			ana = ana + 0.02;
			
			i = i + 1;
		}
	
		System.out.println("Demorara " + i + " anos para maria ser maior que ana!");
		System.out.println(String.format("Maria tera %.2f", maria));
		System.out.println(String.format("Ana tera %.2f", ana));
	}	
	
	
}
