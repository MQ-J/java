import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		// variáveis
		int numero1, numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		// criando e instanciando um objeto de Calculadora
		Calculadora batata = new Calculadora(numero1, numero2);
		
		// usando os metodos da batata, uma Calculadora, com as variáveis da classe Principal
		JOptionPane.showMessageDialog(null, "Soma: "          + batata.soma());
		JOptionPane.showMessageDialog(null, "Subtração: "     + batata.subtracao());
		JOptionPane.showMessageDialog(null, "Multiplicação: " + batata.multiplicacao());
		JOptionPane.showMessageDialog(null, "Divisão: "       + batata.divisao());
	}

}
