/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddragon;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Vitor
 */
public class TelaGameOver extends JFrame{
    
    JLabel tela;
    
    public TelaGameOver (){

      
        
        this.setSize(700, 700);
        this.setTitle("Sword Dragon");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
        tela = new JLabel(new ImageIcon("imagemmmm/Game_OVER.jpg"));
        tela.setBounds(0, 0, 600, 600);
        this.add(tela);
        
        this.repaint();
    }
    
    
    
}
