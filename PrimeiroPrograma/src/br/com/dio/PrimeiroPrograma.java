package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		
		/*int x;
		int y;
		
		x = 2;
		y = 3;
		
		System.out.println("SOMA = "+(x+y));*/

	}

}

class Livros{
	private String nome;
	private Integer npag;
}