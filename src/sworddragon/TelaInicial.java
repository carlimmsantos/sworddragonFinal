/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddragon;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Carlos Vitor
 */
public class TelaInicial extends JFrame {
    
    private JLabel botaojogar,botaoajuda,botaosair;
    
    private JLabel tela;
    
    public TelaInicial (){

        setLayout(null);
        setVisible(true);
        
        this.setSize(800, 360);
        this.setTitle("Sword Dragon");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        botaojogar = new JLabel (new ImageIcon("imagemmmm/BotaoJogar.png"));
        botaojogar.setBounds(584, 17, 200, 91);
        botaojogar.setVisible(true);
        this.add(botaojogar);
        
        
        botaoajuda = new JLabel(new ImageIcon("imagemmmm/BotaoSobre.png"));
        botaoajuda.setBounds(579, 112, 210, 97);
       botaoajuda.setVisible(true);
       this.add(botaoajuda);
       
        
        botaosair = new JLabel (new ImageIcon("imagemmmm/BotaoSair.png"));
        botaosair.setBounds(574, 218, 210, 97);
       botaosair.setVisible(true);
        this.add(botaosair);
        
        
        tela= new JLabel(new ImageIcon("imagemmmm/TelaInicial.jpg"));
        tela.setBounds(0, 0, 800, 332);
        this.add(tela);
        
        botaojogar.addMouseListener(new ControleTelaInicial(this));
       botaoajuda.addMouseListener(new ControleTelaInicial(this));
       botaosair.addMouseListener(new ControleTelaInicial(this));
       
       this.repaint();
         }

    public JLabel getBotaojogar() {
        return botaojogar;
    }

    public void setBotaojogar(JLabel botaojogar) {
        this.botaojogar = botaojogar;
    }

    public JLabel getBotaoajuda() {
        return botaoajuda;
    }

    public void setBotaoajuda(JLabel botaoajuda) {
        this.botaoajuda = botaoajuda;
    }

    public JLabel getBotaosair() {
        return botaosair;
    }

    public void setBotaosair(JLabel botaosair) {
        this.botaosair = botaosair;
    }

   
  
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()  == botaojogar){
            new TelaDeJogo();
        
        }
        
        else if (e.getSource() == botaoajuda){
            
    }
        
       else if(e.getSource() == botaosair){
       System.exit(0);
       }
        
        
        }
        
   

   

    
    
}
