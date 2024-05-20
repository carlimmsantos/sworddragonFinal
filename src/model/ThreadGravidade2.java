 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.logging.Level;
import java.util.logging.Logger;
import sworddragon.TelaDeJogo;

/**
 *
 * @author Carlos Vitor
 */
public class ThreadGravidade2 extends Thread {

    private TelaDeJogo tela;

    public void run() {
        super.run();
        while (true) {
            if (tela.getPulando()>0) {
                tela.getHeroi().setLocation(tela.getHeroi().getX(), tela.getHeroi().getY() -10 );
                tela.setPulando(tela.getPulando()-10);
            }
            
            else if (tela.getHeroi().getY() + tela.getHeroi().getHeight() < 540){
                 tela.getHeroi().setLocation(tela.getHeroi().getX(), tela.getHeroi().getY() +5);
            }

            try {
                sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadGravidade2.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            if (tela.getHeroi().getY() == 380){
              
                tela.setAuxcontador(2);}
        
        
        }
        
      
    }

    public ThreadGravidade2(TelaDeJogo tela) {
        this.tela = tela;
    }

    
    
    

}
