 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagem;

import javax.swing.ImageIcon;

/**
 *
 * @author Carlos Vitor
 */
public class Chefe extends Inimigo {

  public Chefe (int vida, int forca, int defesa, int xp){
      
      this.setIcon(new ImageIcon("imagemmmm/Boss_De_Frente.png"));
        setEmderecoImagemInimigoParado("imagemmmm/Boss_De_Frente.png");
    
        getEnderecosImagemAndandoEsquerda().add("imagemmmm/Boss_Esquerda_1.png");
        getEnderecosImagemAndandoEsquerda().add("imagemmmm/Boss_Esquerda_2.png");
        getEnderecosImagemAndandoEsquerda().add("imagemmmm/Boss_Esquerda_3.png");
        getEnderecosImagemAndandoEsquerda().add("imagemmmm/Boss_Esquerda_4.png");
      
        setSize(getIcon().getIconWidth(),getIcon().getIconHeight());
        
      
        
        setAtacando(false);
  
  
  
  
  }
   

}
