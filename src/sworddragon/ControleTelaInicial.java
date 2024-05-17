/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddragon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Carlos Vitor
 */
public class ControleTelaInicial implements MouseListener {
    
    private TelaInicial tela;
    
    public ControleTelaInicial (TelaInicial aThis){
        tela = aThis;
    }

    @Override
    public void mouseClicked(MouseEvent me) {

        if (me.getSource() == tela.getBotaojogar()){
        new TelaDeJogo();
        }
        else if (me.getSource() == tela.getBotaoajuda()){
      new TelaDeSobre();
        }
        else if (me.getSource() == tela.getBotaosair()){
            tela.dispose();
            System.exit(0);
        }

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    if (me.getSource() == this.tela.getBotaojogar()) {
            this.tela.getBotaojogar().setIcon(new ImageIcon("imagemmmm/BotaoJogar_Click.png"));
        }
    else if ( me.getSource() == this.tela.getBotaosair()){
            this.tela.getBotaosair().setIcon(new ImageIcon("imagemmmm/BotaoSair_Click.png"));
        }
    else if ( me.getSource() == this.tela.getBotaoajuda()){
            this.tela.getBotaoajuda().setIcon(new ImageIcon("imagemmmm/BotaoSobre_Click.png"));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
if (me.getSource() == this.tela.getBotaojogar()) {
            this.tela.getBotaojogar().setIcon(new ImageIcon("imagemmmm/BotaoJogar.png"));
        }

else if  (me.getSource() == this.tela.getBotaoajuda()) {
            this.tela.getBotaoajuda().setIcon(new ImageIcon("imagemmmm/BotaoSobre.png"));
        }
else if  (me.getSource() == this.tela.getBotaosair()) {
            this.tela.getBotaosair().setIcon(new ImageIcon("imagemmmm/BotaoSair.png"));
        }


    }
    
    
        
            

    
}
