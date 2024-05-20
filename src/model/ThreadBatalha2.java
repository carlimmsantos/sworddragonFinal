/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;
import javax.swing.ImageIcon;
import personagem.Esqueleto;
import personagem.Heroi;
import personagem.Inimigo;
import sworddragon.TelaDeJogo;
import sworddragon.TelaGameOver;

/**
 *
 * @author Carlos Vitor
 */
public class ThreadBatalha2 extends Thread {

    private TelaDeJogo tela;
    public ThreadBatalha2(TelaDeJogo tela) {
        this.tela = tela;
    }

    public void run() {
        super.run();
        
        

        while (tela.getGameOver() == false) {
            
           
            if (tela.getHeroi().getVida() <= 0) {

                tela.getHeroi().setIcon(new ImageIcon("imagemmmm/personagemMorto.png"));
                tela.getHeroi().setBounds(tela.getHeroi().getX(),tela.getHeroi().getY() , 163, 114);
                tela.setGameOver(true);
                          tela.getVida_Do_Personagem().setText("HP " + 0);
                try {
                    sleep(50);
                } catch (Exception e) {
                }
                new TelaGameOver();
                break;

            }

            Random rad = new Random();
            if (tela.getInimigos().size() < 2 && rad.nextInt(10) > 3) {

                Esqueleto esqueleto = new Esqueleto(50,10,5,rad.nextInt(1) + 1);
                esqueleto.setBounds(rad.nextInt(1000), 400, esqueleto.getIcon().getIconWidth(), esqueleto.getIcon().getIconHeight());

                tela.add(esqueleto);
                tela.getInimigos().add(esqueleto);
                tela.setComponentZOrder(esqueleto, 0);
                tela.repaint();
                 
                try {

                            sleep(500);

                        } catch (InterruptedException ex) {
                        }
                
            }
            if (rad.nextInt(10) > 5 && tela.getHeroi().getVida() <= tela.getHeroi().getAntesVida() && tela.getGameOver() == false){
            
                tela.getHeroi().setVida(tela.getHeroi().getVida() + 5);
                tela.getVida_Do_Personagem().setText("HP " + tela.getHeroi().getVida());
        
            
            }

            if (tela.getInimigos().size() > 0) {

                for (int i = 0; i < tela.getInimigos().size(); i++) {

                    Inimigo inimigo = tela.getInimigos().get(i);

                    if (inimigo.getX() > tela.getHeroi().getX()) {
                        inimigo.setLocation(inimigo.getX() - 10, inimigo.getY());
                        
                        
                          try {

                            sleep(200);

                        } catch (InterruptedException ex) {
                        }
                          }
                    
                   else {
                        
                        inimigo.setLocation(inimigo.getX() + 10, inimigo.getY());

                        try {

                            sleep(200);

                        } catch (InterruptedException ex) {
                        }

                    }
                        
                    
                        if (pegou(inimigo, tela.getHeroi()) == true) {

                            if (tela.getHeroi().getStatusHeroi() == true) {
                                inimigo.setVida(inimigo.getVida() - tela.getHeroi().getForca());

                                if (inimigo.getVida() <= 0) {
                                    inimigo.setVisible(false);
                                    tela.remove(inimigo);
                                    tela.getInimigos().remove(inimigo);
                                    tela.getHeroi().setXp(tela.getHeroi().getXp() + 1 );
                                    tela.setNumerodapontuacao(tela.getNumerodapontuacao() + 10);
                                    tela.getPontuacao().setText("Pontuação: " + tela.getNumerodapontuacao());
                                        
                                      
                                  
                                    
                                    if (tela.getHeroi().getXp() == 10){
                                   
                                    tela.getHeroi().setXp(0);
                                    
                                    tela.getHeroi().proximoNivel();
                                   
                                  
                                    
                                    
                                    }

                                } 

                                }
                            
                            else 
                                try {
                                    sleep(500);
                                } catch (Exception e) {
                                }
                                    tela.getHeroi().setVida(tela.getHeroi().getVida() - 10);
                                    System.out.println(tela.getHeroi().getVida());
                                    tela.getVida_Do_Personagem().setText("HP " + tela.getHeroi().getVida());


                            }
                            if (tela.getHeroi().getNivel() == tela.getHeroi().getAuxDragao()){
                              
                            tela.setChefe(true);
                              break;
                            
                            }
                            
                        }

                        try {
                            sleep(200);

                        } catch (InterruptedException ex) {
                        }


                }

            }

        }
   

    

    public boolean pegou(Inimigo i, Heroi h) {

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
