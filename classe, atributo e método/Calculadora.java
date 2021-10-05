
public class Calculadora {
	
	// atributos da classe Operacoes
	public int n1;
	public int n2;
	
	// metodos da classe Operacoes
	public Calculadora(int x, int y) // metodo construtor
	{
		this.n1 = x;
		this.n2 = y;
	}
	
	public int soma() // metodo soma
	{
		return this.n1 + this.n2;
	}
	
	public int subtracao() // metodo subtracao
	{
		return this.n1 - this.n2;
	}
	
	public int multiplicacao() // metodo multiplicacao
	{
		return this.n1 * this.n2;
	}
	
	public int divisao() // metodo divisao
	{
		return this.n1 / this.n2;
	}
}
