package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* A classe "Pessoa" tem o objetivo de criar uma pessoa
 * a partir dos atributos que a compoem.
 * 
 * @author taynara
 * @version 1.0
 */

public class Pessoa {
	//declarando atributos
	private String nome;
	private double altura;
	private LocalDate nasc_data;
	
	//fazendo construtor da classe pessoa

	public Pessoa(String nome, double altura, String nasc_data) throws Exception {
		this.nome = nome;
		this.altura = altura;
		this.nasc_data = ValidateDate(nasc_data);
	}	
	
	public String getPessoa(){
		return 
			"Nome: " + nome + 
			"\nAltura: " + altura +
			"\nData de Nascimento: " + nasc_data;
	}
	
	/* metodo que cria email a partir do nome dado pela pessoa e 
	 * utiliza um array (lista) e a função split, responsável por
	 * separar uma string. alem da funcao toLowerCase que ...
	 */
	public String CreateEmail(){
		String [] nomeArray = this.nome.toLowerCase().split(" ");
		String nome = nomeArray[0], sobrenome = nomeArray[1];
		return nome + "." + sobrenome + "@dominio" ; 
	}
	/*
	 * Esse método tem o objetivo de formatar a data para validar.
	 */
	private LocalDate ValidateDate(String nasc_data) throws Exception {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate nasc_data_formatada = LocalDate.parse(nasc_data, formatador);
		if(nasc_data_formatada.isBefore(today)) {
			return nasc_data_formatada;
		} else {
			throw new Exception("Essa Data é invalida.");
		}
	}

}