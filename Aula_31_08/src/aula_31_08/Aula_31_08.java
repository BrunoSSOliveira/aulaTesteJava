
package aula_31_08;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Font;

public class Aula_31_08 {

    public static void main(String[] args) {
        
        JFrame j1 = new JFrame("Aula 31-08-21"); //instanciando janela/frame
        
        
        //configurando janela
        
        j1.setSize(600,400); //definindo tamanho
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar janela ao clicar no X
        j1.setVisible(true); //tornando visível
        j1.setResizable(false); //não permite redimensionar a tela
        
        j1.setLocationRelativeTo(null); //alinhando no centro da tela
        
        //configurando painel 1
        
        JPanel p1 = new JPanel(); // instanciando painel 1
        j1.add(p1); // adicionando painel na janela 1 
        p1.setBackground(Color.green);
        p1.setLayout(null);
        
        //configurando botão 1
        ActionListener escutaBtn1; //instanciando o listener/ouvinte do botão para gerar uma ação
        JButton btn1 = new JButton("Iniciar"); // instanciando botão 1
        p1.add(btn1); // adicionando botão 1 no painel 1
        btn1.setBounds(250, 160, 100, 30);
        
        JLabel lbl1 = new JLabel();
        p1.add(lbl1);
        lbl1.setText("Botão pressionado!");
        lbl1.setFont(new Font("Times new Roman", Font.BOLD, 20));
        lbl1.setForeground(Color.black);
        lbl1.setBounds(225, 10, 200, 200);
        lbl1.setVisible(false);
        
        
        JCheckBox cb1 = new JCheckBox("Azul");
        p1.add(cb1);
        cb1.setBounds(30, 200, 100, 100);
        cb1.setBackground(Color.green);
        cb1.setVisible(false);
        //cb1.setSelected(true);
        
        escutaBtn1 = new ActionListener() { //instanciando o listener/ouvinte do botão para gerar uma ação
            @Override
            public void actionPerformed(ActionEvent ae) {
                lbl1.setVisible(true);
                cb1.setVisible(true);
                
                if(cb1.isSelected()){
                    lbl1.setForeground(Color.blue);
                }
            }
        };
        
        btn1.addActionListener(escutaBtn1); // adicionando evento ao botão
        
        
        
    }
    
}
