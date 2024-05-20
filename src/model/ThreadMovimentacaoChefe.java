/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import javax.swing.ImageIcon;
import personagem.Chefe;
import sworddragon.TelaDeJogo;
import sworddragon.TelaGameOver;

/**
 *
 * @author Carlos Vitor
 */
public class ThreadMovimentacaoChefe extends Thread{
    private TelaDeJogo tela;
    private Chefe boss;
    
    
    
    public void run (){
    super.run();
    
     if (tela.getQuantidade_de_boss() ==1){    
         tela.setQuantidade_de_boss(0);
        if (tela.isChefe() == true){
            Chefe boss = new Chefe(1000,50,30,0);
            boss.setVisible(true);
            boss.setBounds(1000, 380, boss.getIcon().getIconWidth(), boss.getIcon().getIconHeight());
        
            tela.add(boss);
            tela.setComponentZOrder(boss, 0);
            tela.repaint();
        }
        
        }
        
        while (tela.isChefe() == true && tela.getGameOver() == false ){
                if (tela.getHeroi().getX() > boss.getX())
                {
                    boss.setLocation(boss.getX() + 10, boss.getY());
                 //   boss.setIcon(new ImageIcon( boss.geten));
                }
                else {
                   boss.setLocation(boss.getX() - 10, boss.getY());
                    }
                
                if (pegou(boss, tela.getHeroi()) == true){
                    
                    if (tela.getHeroi().getStatusHeroi() == true){
                        
                        int forcarDoAtaque = boss.getVida() - ( tela.getHeroi().getForca() - boss.getDefesa() );
                        
                        if (forcarDoAtaque <= 0 ){
                            forcarDoAtaque = 1;
                        boss.setVida( forcarDoAtaque );}
                        else{
                        boss.setVida( forcarDoAtaque );}
                    }
                    
                    else {
                    
                    int forcarDoAtaque = tela.getHeroi().getVida()-(  boss.getForca() - tela.getHeroi().getDefesa());
                     if (forcarDoAtaque <= 0 ){
                            forcarDoAtaque = 1;
                       tela.getHeroi().setVida( forcarDoAtaque );
                     }
                     else{
                        tela.getHeroi().setVida( forcarDoAtaque );
                    }
                     
                    
                    
                    }
                if (boss.getVida() <= 0 ){
                boss.setVisible(false);
                tela.setChefe(false);
                tela.remove(boss);
                //new TelaCampeao();
                
                
                }
                
               else if (tela.getHeroi().getVida() <= 0 ){
                
                tela.getHeroi().setIcon(new ImageIcon("imagemmmm/personagemMorto.png"));
                tela.getHeroi().setBounds(tela.getHeroi().getX(),tela.getHeroi().getY() , 163, 114);
                try {
                    sleep(50);
                } catch (Exception e) {
                }
                new TelaGameOver();
                break;
                
                
                }
                
                
                }
        
          
            
            
            
          
            
            
            }
        
        
        
        
        
        }

    public ThreadMovimentacaoChefe(TelaDeJogo tela) {
        this.tela = tela;
    }
    public boolean pegou(Component i, Component h) {

        int hX = h.getX();
        int hY = h.getY();
        int ladoDireitoA = hX + h.getWidth();
        int ladoEsquerdoA = hX;
        int ladoBaixoA = hY + h.getHeight();
        int ladoCimaA = hY;

        int iX = i.getX();
        int bY = i.getY();
        int ladoDireitoB = iX + i.getWidth();
        int ladoEsquerdoB = iX;
        int ladoBaixoB = bY + i.getHeight();
        int ladoCimaB = bY;

        boolean encostou = false;
        boolean cDireita = false;
        boolean cEsquerda = false;
        boolean cBaixo = false;
        boolean cCima = false;

        if (ladoDireitoA >= ladoEsquerdoB) {
            cDireita = true;
        }
        if (ladoEsquerdoA <= ladoDireitoB) {
            cEsquerda = true;
        }
        if (ladoCimaA <= ladoBaixoB) {
            cCima = true;
        }
        if (ladoBaixoA >= ladoCimaB) {
            cBaixo = true;
        }

        if (cDireita && cEsquerda && cCima && cBaixo) {
            encostou = true;
        }
        return (encostou);
    }
    }

