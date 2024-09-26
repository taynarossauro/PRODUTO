package models;


/* A classe produto tem o objetivo de criar/instanciar um produto
 * a partir dos atributos e parâmetros que o compõem
 * 
 * @author taynara
 * @version 1.0
 */
public class Produto {
	
	
	//declarando atributos
	private String nome, marca; //nome e marca do produto, respectivamente.
	private double custo, venda; //valor de custo e venda do produto, respectivamente,
	
	
	// Construtor da classe Produto
	public Produto(String nome, String marca, double custo, double venda) {
		this.nome = nome; 
		this.marca = marca; 
		this.custo = custo; 
		this.venda = venda;
	}
	
	
    /* Metodo que retorna uma descrição completa do produto.
     * 
     * @return: descrição do produto.
     */
	public String getProd(){
		return 
			"Produto: " + nome + 
			"\nMarca: " + marca +
			"\nValor de custo: " + custo + 
			"\nValor de venda: " + venda +
			"\nValor de lucro: " + calcularLucro();
	}
	
	
    /* Metodo que retorna lucro baseado nas subtração de custo pela venda
     * 
     * @return: valor do lucro
     */
	public double calcularLucro(){
		double lucro = this.venda - this.custo;
		return lucro;
	}
}
