/*janela pop-up padr�o*/
import javax.swing.*;

/*janela pop-up personalizada*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class janelas {

	public static void main(String[] args) {
			
		/*janela pop-up padr�o*/
		JOptionPane.showMessageDialog(null, "ATEN��O\nObrigado pela aten��o");
			
			
		/* janela pop-up personalizada */
		JFrame jd = new JFrame();                                     //janela completa - comenta a outra
		//JDialog jd = new JDialog();                                   //janela simples - comenta a outra
		jd.setLayout(new FlowLayout());                                 //sem isso, s� aparece o bot�o
		jd.setBounds(500, 300, 200, 100);                               //eixo x, eixo y, largura e altura da janela
		JLabel fraseBonita = new JLabel("o bot�o 'fechar' faz fechar"); //cria um conte�do
		JButton botaoFechar = new JButton("fechar");                    //cria um bot�o
		botaoFechar.addActionListener(new ActionListener() {            //fun��o que roda ao clicar nesse bot�o
			public void actionPerformed(ActionEvent e) {
				jd.dispose();
				}
			});
		jd.add(fraseBonita);                                            //adiciona esse conte�do na janela
		jd.add(botaoFechar);                                            //adiciona esse bot�o na janela
		jd.setVisible(true);                                            //faz a janela aparecer
		}

	}