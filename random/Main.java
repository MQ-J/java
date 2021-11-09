import java.util.*;
import javax.swing.*;

class Main {
  public static void main(String[] args) {

    //variáveis
    int repete, tamanho;
    String numeros = " ";
    Random gera = new Random();

    //recebe definições do usuário
    repete = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros aleatórios você quer?"));
    tamanho = Integer.parseInt(JOptionPane.showInputDialog("Os números vão variar de 0 a quanto?"));

    //gera numeros aleatórios e junta na string
    for(int i=0; i<repete; i++)
      numeros += gera.nextInt(tamanho) + " | ";
  
    //mostra a string
    JOptionPane.showMessageDialog(null, numeros);
  }
}