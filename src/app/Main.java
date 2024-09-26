package app;

import models.*;

/*
 * Essa é a classe principal que instancia os objetos mencionados
 * nas classes em "models".
 * 
 * @author taynara
 * version 1.0
 */
public class Main {
	
	public static void main(String[] args){
		try {
			//instanciando objeto "prod"
			Produto prod = new Produto("pão", "panco", 3.0, 5.0); //the first one represents our type product, the second it is our constructor.
			//printando os atributos e o lucro
			System.out.println(prod.getProd() +  "\n");
		
			//criando objeto "pessoa
			Pessoa pessoa = new Pessoa("Taynara Raquel", 1.70,"22/11/2004");
			System.out.println(pessoa.getPessoa());
			
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
			
		}
	}
}
