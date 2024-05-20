/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddragon;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Carlos Vitor
 */
public class TelaDeSobre extends JFrame{
    private JLabel tela;
            
  public TelaDeSobre (){
  this.setSize(1214,574);
  this.setVisible(true);
  this.setResizable(false);
  
  tela = new JLabel (new ImageIcon("imagemmmm/TelaSobre.png"));
  tela.setBounds(0, 0, 1214, 574);
  this.add(tela);
  
  this.repaint();
  
  }

    
}
