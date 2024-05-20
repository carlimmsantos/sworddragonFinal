package personagem;


import javax.swing.ImageIcon;


public class Esqueleto extends Inimigo{
 
    
    
  

    public Esqueleto(int vida, int forca, int defesa, int xp) {
   
              this.setIcon(new ImageIcon("imagemmmm/Monstro_Parado.png"));
        setEmderecoImagemInimigoParado("imagemmmm/Monstro_Parado.png");
    
        getEnderecosImagemAndandoEsquerda().add("imagemmmm/Monstro_Primeiro_Passo_E.png");
        getEnderecosImagemAndandoEsquerda().add("imagemmmm/Monstro_Segundo_Passo_E.png");
        
        setSize(getIcon().getIconWidth(),getIcon().getIconHeight());
        
        getEnderecosImagemAtacando().add("imagemmmm/Monstro_Parado.png");
        getEnderecosImagemAtacando().add("imagemmmm/Monstro_Atacando.png");
        
        setAtacando(false);
    }
    
    

   
    
}

