/*janela pop-up padrão*/
import javax.swing.*;

/*janela pop-up personalizada*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class janelas {

	public static void main(String[] args) {
			
		/*janela pop-up padrão*/
		JOptionPane.showMessageDialog(null, "ATENÇÃO\nObrigado pela atenção");
			
			
		/* janela pop-up personalizada */
		JFrame jd = new JFrame();                                     //janela completa - comenta a outra
		//JDialog jd = new JDialog();                                   //janela simples - comenta a outra
		jd.setLayout(new FlowLayout());                                 //sem isso, só aparece o botão
		jd.setBounds(500, 300, 200, 100);                               //eixo x, eixo y, largura e altura da janela
		JLabel fraseBonita = new JLabel("o botão 'fechar' faz fechar"); //cria um conteúdo
		JButton botaoFechar = new JButton("fechar");                    //cria um botão
		botaoFechar.addActionListener(new ActionListener() {            //função que roda ao clicar nesse botão
			public void actionPerformed(ActionEvent e) {
				jd.dispose();
				}
			});
		jd.add(fraseBonita);                                            //adiciona esse conteúdo na janela
		jd.add(botaoFechar);                                            //adiciona esse botão na janela
		jd.setVisible(true);                                            //faz a janela aparecer
		}

	}