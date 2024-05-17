/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import personagem.Heroi;

/**
 *
 * @author ALUNO
 */
public class ThreadHeroiAtacando extends Thread {
    private Heroi heroi;

 

    public ThreadHeroiAtacando(Heroi heroi) {
        this.heroi = heroi;
    }
   
 public void run(){
 super.run();
 heroi.setStatusHeroi(true);
 for (int i = 0; i < heroi.getHeroiAtacandoDireita().size(); i++) {
            
     
     try {
                sleep(150);//150
            }
     
     catch (InterruptedException ex) {
            }
   if (heroi.getLado() == true){ 
       heroi.setIcon(new ImageIcon(heroi.getHeroiAtacandoDireita().get(heroi.proximaImagemAtaqueDireita())));
            heroi.setBounds(heroi.getX(),heroi.getY(),heroi.getIcon().getIconWidth(),heroi.getIcon().getIconHeight());}
   
   else { heroi.setIcon(new ImageIcon(heroi.getHeroiAtacandoEsquerda().get(heroi.proximaImagemAtaqueEsquerda())));
            heroi.setBounds(heroi.getX(),heroi.getY(),heroi.getIcon().getIconWidth(),heroi.getIcon().getIconHeight());}
          
        
        }
 
 heroi.setStatusHeroi(false);
        try {
            sleep(100);
        } catch (InterruptedException ex) {
        }
    }
 
 }
