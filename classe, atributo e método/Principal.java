import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		// vari�veis
		int numero1, numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		// criando e instanciando um objeto de Calculadora
		Calculadora batata = new Calculadora(numero1, numero2);
		
		// usando os metodos da batata, uma Calculadora, com as vari�veis da classe Principal
		JOptionPane.showMessageDialog(null, "Soma: "          + batata.soma());
		JOptionPane.showMessageDialog(null, "Subtra��o: "     + batata.subtracao());
		JOptionPane.showMessageDialog(null, "Multiplica��o: " + batata.multiplicacao());
		JOptionPane.showMessageDialog(null, "Divis�o: "       + batata.divisao());
	}

}
