/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddragon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import model.ThreadBatalha2;
import model.ThreadGravidade2;
import model.ThreadHeroiAtacando;
import model.ThreadMovimentacaoChefe;
import personagem.Esqueleto;
import personagem.Heroi;
import personagem.Inimigo;

/**
 *
 * @author Carlos Vitor
 */
public class TelaDeJogo extends JFrame  implements KeyListener{

    private ArrayList <Inimigo> inimigos;
    private JLabel Pontuacao;
    private JLabel Vida_Do_Personagem;
    private int quantidade_de_boss = 1;
    private int auxcontador;
    private int pulando;
    private int hpheroi;
    private Heroi heroi;
    private Inimigo inimigo;
    private JLabel cenario;
    private boolean gameOver;
    private boolean chefe;
    private int numerodapontuacao;
    

  
    
    public TelaDeJogo () {
        
    
        this.setLayout(null);
        this.setVisible(true);
        
        this.setSize(1500, 700);
        this.setTitle("Sword Dragon");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       Random rand = new Random ();
       heroi= new Heroi(100,10,10,10,0,0,rand.nextInt(10) );
       heroi.setBounds(0, 380,heroi.getIcon().getIconWidth(),heroi.getIcon().getIconHeight());
       heroi.setAntesVida(heroi.getVida());
       this.add(heroi);
       
       
        Vida_Do_Personagem=new JLabel("HP: " + heroi.getVida());
        Vida_Do_Personagem.setBounds(50,10,150,25);
        Vida_Do_Personagem.setForeground(Color.RED);

        this.add(Vida_Do_Personagem);
        
        numerodapontuacao = 0;
        Pontuacao = new JLabel ("Pontuacao:" + numerodapontuacao );
        Pontuacao.setBounds(800,10,200,25);
        Pontuacao.setForeground(Color.RED);

        this.add(Pontuacao);
      
       cenario = new JLabel(new ImageIcon("imagemmmm/TelaDeJogo.jpg"));
      cenario.setBounds(0, 0, 1920, 692);
      
      this.add(cenario);
    
      
      auxcontador = 2;
      inimigos = new ArrayList();
      gameOver = (false); 
      chefe = false;
      
      heroi.addKeyListener(this);
      this.addKeyListener(this);
         
       
    

    new ThreadGravidade2(this).start();
     new ThreadBatalha2(this).start();
    // new ThreadMovimentacaoChefe(this).start();

    
    }  

    public JLabel getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(JLabel Pontuacao) {
        this.Pontuacao = Pontuacao;
    }

    public JLabel getVida_Do_Personagem() {
        return Vida_Do_Personagem;
    }

    public void setVida_Do_Personagem(JLabel Vida_Do_Personagem) {
        this.Vida_Do_Personagem = Vida_Do_Personagem;
    }

    public int getNumerodapontuacao() {
        return numerodapontuacao;
    }

    public void setNumerodapontuacao(int numerodapontuacao) {
        this.numerodapontuacao = numerodapontuacao;
    }
    

    public int getQuantidade_de_boss() {
        return quantidade_de_boss;
    }

    public void setQuantidade_de_boss(int quantidade_de_boss) {
        this.quantidade_de_boss = quantidade_de_boss;
    }

    public boolean isChefe() {
        return chefe;
    }

    public void setChefe(boolean chefe) {
        this.chefe = chefe;
    }
    
    
    public ArrayList<Inimigo> getInimigos() {
        return inimigos; 
    }
    

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }
    
  public boolean getGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getAuxcontador() {
        return auxcontador;
    }

    public void setAuxcontador(int auxcontador) {
        this.auxcontador = auxcontador;
    }

    public int getHpheroi() {
        return hpheroi;
    }

    public void setHpheroi(int hpheroi) {
        this.hpheroi = hpheroi;
    }

 
    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi heroi) {
        this.heroi = heroi;
    }
    public int getPulando() {
        return pulando;
    }

    public void setPulando(int pulando) {
        this.pulando = pulando;
    }
    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

    public JLabel getCenario() {
        return cenario;
    }

    public void setCenario(JLabel cenario) {
        this.cenario = cenario;
    }
    @Override
    public void keyTyped(KeyEvent e) {

  
             if ((e.getKeyChar() == 'd' || e.getKeyChar() == 'D') && heroi.getX() <= 1200 && heroi.getStatusHeroi() == false && gameOver == false) {
                            //System.out.println(heroi.getX());
                        heroi.setLocation(heroi.getX() + 15, heroi.getY());
                       heroi.setIcon(new ImageIcon(heroi.getAndandoDireita().get(heroi.proximaImagemAndandoDireita())));
                       heroi.setLado(true);
                    
                }
    
            
    else if ((e.getKeyChar() == 'a' || e.getKeyChar() == 'A') && heroi.getX()> 0 && heroi.getStatusHeroi() == false && gameOver == false) {
                        heroi.setLocation(heroi.getX() - 15, heroi.getY());
                        heroi.setIcon(new ImageIcon(heroi.getAndandoEsqueda().get(heroi.proximaImagemAndandoEsquerda())));
                        heroi.setLado(false);
                    

                    
    }
 
               else if ((e.getKeyChar() == 'w' || e.getKeyChar() == 'W') && heroi.getStatusHeroi() == false && gameOver == false) {
                      //  heroi.setLocation(heroi.getX(), heroi.getY()-100);
                       auxcontador -= 1;
                      if (auxcontador > 0){
                          
                          if (heroi.getLado()== false){
                        heroi.setIcon(new ImageIcon(heroi.getAndandoEsqueda().get(heroi.proximaImagemAndandoEsquerda())));
                          }
                          else {
                            heroi.setIcon(new ImageIcon(heroi.getAndandoDireita().get(heroi.proximaImagemAndandoDireita())));
                          
                          }
                                
                        
                        if(pulando==0){
                            pulando=200;
                    }
                         }}
             
          
    }
                    
               
       
  
    
     
    

    @Override
    public void keyPressed(KeyEvent e) {
                
    }

    @Override
    public void keyReleased(KeyEvent e) {
            if ((e.getKeyChar()== 'b' || e.getKeyChar() == 'B') && heroi.getX()> 0 && heroi.getX() <= 1200 && gameOver == false){
                   if (heroi.getStatusHeroi() == false){
                       
                    
                   new ThreadHeroiAtacando(heroi).start();     
                   heroi.setStatusHeroi(false);  
                    //heroi.setBounds(heroi.getX() + 15, getY(), heroi.getIcon().getIconWidth(), heroi.getIcon().getIconHeight());
                   
                   
                   }}
        
    }


}


   
  

