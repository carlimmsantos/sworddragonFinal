/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagem;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Vitor
 */
public class Heroi extends JLabel {

    private boolean statusHeroi;

    private ArrayList<String> andandoDireita, andandoEsqueda, heroiAtacandoDireita, heroilevandodano,heroiAtacandoEsquerda;
    private int imagemAtualAndandoEsquerda, imagemAtualAndandoDireita, imagemLevandoDano, imagemAtacandoDireita,imagemAtacandoEsquerda;
    private boolean lado; //esquerda = false, direita = true;
    private int antesVida;
    private int vida;
    private int dinheiro;
    private int forca;
    private int defesa;
    private int xp;
    private int nivel;
    private int auxDragao;

    public Heroi(int vida, int dinheiro, int forca, int defesa, int xp, int nivel, int auxDragao) {

        statusHeroi = false;
        this.setIcon(new ImageIcon("imagemmmm/Heroi.png"));
        this.vida = vida;
        this.dinheiro = dinheiro;
        this.forca = forca;
        this.defesa = defesa;
        this.xp = xp;
        this.nivel = nivel;
        this.auxDragao = auxDragao;
        
        andandoDireita = new ArrayList();
        andandoDireita.add("imagemmmm/Primeiro_Passo_D.png");
        andandoDireita.add("imagemmmm/Segundo_Passo_D.png");
        andandoDireita.add("imagemmmm/Terceiro_Passo_D.png");
        
        andandoEsqueda = new ArrayList();
        andandoEsqueda.add("imagemmmm/Primeiro_Passe_E.png");
        andandoEsqueda.add("imagemmmm/Segundo_Passo_E.png");
        andandoEsqueda.add("imagemmmm/Terceiro_Passo_E.png");
        
        heroiAtacandoDireita = new ArrayList();
        heroiAtacandoDireita.add("imagemmmm/Primeiro_Ataque_D.png");
        heroiAtacandoDireita.add("imagemmmm/Segundo_Ataque_D.png");
        heroiAtacandoDireita.add("imagemmmm/Terceiro_Ataque_D.png");
        heroiAtacandoDireita.add("imagemmmm/Quarto_Ataque_D.png");
        
        heroiAtacandoEsquerda = new ArrayList();
        heroiAtacandoEsquerda.add("imagemmmm/Primeiro_Ataque_E.png");
        heroiAtacandoEsquerda.add("imagemmmm/Segundo_Ataque_E.png");
        heroiAtacandoEsquerda.add("imagemmmm/Terceiro_Ataque_E.png");
        heroiAtacandoEsquerda.add("imagemmmm/Quarto_Ataque_E.png");

    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAuxDragao() {
        return auxDragao;
    }

    public void setAuxDragao(int auxDragao) {
        this.auxDragao = auxDragao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

   public boolean getLado() {
        return lado;
    }

    public void setLado(boolean lado) {
        this.lado = lado;
    }

    public ArrayList<String> getHeroiAtacandoDireita() {
        return heroiAtacandoDireita;
    }

    public void setHeroiAtacandoDireita(ArrayList<String> heroiAtacandoDireita) {
        this.heroiAtacandoDireita = heroiAtacandoDireita;
    }

    public ArrayList<String> getHeroiAtacandoEsquerda() {
        return heroiAtacandoEsquerda;
    }

    public void setHeroiAtacandoEsquerda(ArrayList<String> heroiAtacandoEsquerda) {
        this.heroiAtacandoEsquerda = heroiAtacandoEsquerda;
    }

    public int getImagemAtacandoDireita() {
        return imagemAtacandoDireita;
    }

    public void setImagemAtacandoDireita(int imagemAtacandoDireita) {
        this.imagemAtacandoDireita = imagemAtacandoDireita;
    }

    public int getImagemAtacandoEsquerda() {
        return imagemAtacandoEsquerda;
    }

    public void setImagemAtacandoEsquerda(int imagemAtacandoEsquerda) {
        this.imagemAtacandoEsquerda = imagemAtacandoEsquerda;
    }

   
    public boolean getStatusHeroi() {
        return statusHeroi;
    }

    public void setStatusHeroi(boolean statusHeroi) {
        this.statusHeroi = statusHeroi;
    }

    public int getImagemLevandoDano() {
        return imagemLevandoDano;
    }

    public void setImagemLevandoDano(int imagemLevandoDano) {
        this.imagemLevandoDano = imagemLevandoDano;
    }

 

    public ArrayList<String> getAndandoDireita() {
        return andandoDireita;
    }

    public void setAndandoDireita(ArrayList<String> andandoDireita) {
        this.andandoDireita = andandoDireita;
    }

    public ArrayList<String> getAndandoEsqueda() {
        return andandoEsqueda;
    }

    public void setAndandoEsqueda(ArrayList<String> andandoEsqueda) {
        this.andandoEsqueda = andandoEsqueda;
    }

    public int getImagemAtualAndandoEsquerda() {
        return imagemAtualAndandoEsquerda;
    }

    public void setImagemAtualAndandoEsquerda(int imagemAtualAndandoEsquerda) {
        this.imagemAtualAndandoEsquerda = imagemAtualAndandoEsquerda;
    }

    public int getImagemAtualAndandoDireita() {
        return imagemAtualAndandoDireita;
    }

    public void setImagemAtualAndandoDireita(int imagemAtualAndandoDireita) {
        this.imagemAtualAndandoDireita = imagemAtualAndandoDireita;
    }

    public ArrayList<String> getHeroilevandodano() {
        return heroilevandodano;
    }

    public void setHeroilevandodano(ArrayList<String> heroilevandodano) {
        this.heroilevandodano = heroilevandodano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAntesVida() {
        return antesVida;
    }

    public void setAntesVida(int antesVida) {
        this.antesVida = antesVida;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int proximaImagemAndandoDireita() {
        if (imagemAtualAndandoDireita == andandoDireita.size() - 1) {
            imagemAtualAndandoDireita = 0;
        } else {
            imagemAtualAndandoDireita++;
        }
        return imagemAtualAndandoDireita;
    }

    public int proximaImagemAndandoEsquerda() {
        if (imagemAtualAndandoEsquerda == andandoEsqueda.size() - 1) {
            imagemAtualAndandoEsquerda = 0;
           
        } else {
            imagemAtualAndandoEsquerda++;
            
        }
        return imagemAtualAndandoEsquerda;
    }

    public int proximaImagemAtaqueDireita() {

        if (imagemAtacandoDireita == heroiAtacandoDireita.size() - 1) {
            imagemAtacandoDireita = 0;
            this.setBounds(getX() + 15, getY(), getIcon().getIconWidth(), getIcon().getIconHeight());

        } else {
            imagemAtacandoDireita++;
            
            
            
       

            if (imagemAtacandoDireita == 1) {
                this.setBounds(getX() - 20, getY() - 90, getIcon().getIconWidth(), getIcon().getIconHeight());
            }
            else if (imagemAtacandoDireita == 2 ){
              this.setBounds(getX()-7 , getY()+15, getIcon().getIconWidth(), getIcon().getIconHeight());
            
            }else if (imagemAtacandoDireita == 3) {

                this.setBounds(getX() - 10 , getY() + 75, getIcon().getIconWidth(), getIcon().getIconHeight());

            }
           

        }
        return imagemAtacandoDireita;
    }

    
    public int proximaImagemAtaqueEsquerda() {

        if (imagemAtacandoEsquerda == heroiAtacandoEsquerda.size() - 1) {
             imagemAtacandoEsquerda= 0;
             this.setBounds(getX()+ 25, getY(), getIcon().getIconWidth(), getIcon().getIconHeight());
        } else {
            imagemAtacandoEsquerda++;

           if (imagemAtacandoEsquerda == 1) {
                this.setBounds(getX() - 90, getY() - 90, getIcon().getIconWidth(), getIcon().getIconHeight());
          }
           else if (imagemAtacandoEsquerda == 2 ){
              this.setBounds(getX()-17 , getY()+15, getIcon().getIconWidth(), getIcon().getIconHeight());
            
            }else if (imagemAtacandoEsquerda== 3) {

                this.setBounds(getX() - 20 , getY() + 75, getIcon().getIconWidth(), getIcon().getIconHeight());

            }
        }
        
        return imagemAtacandoEsquerda;
    }
    
    
    public int proximaImagemRecebendoDano() {
        if (imagemLevandoDano == heroilevandodano.size() - 1) {
            imagemLevandoDano = 0;
        } else {
            imagemLevandoDano++;
        }
        return imagemLevandoDano;
    }
    public void proximoNivel (){
        nivel += 1;
        Random rand = new Random();
        
        nivel = rand.nextInt(6);
        
        if (nivel == 1){
            int aumento = rand.nextInt(5);
            forca += aumento;
            JOptionPane.showMessageDialog(null, "Sua força aumentou para "+ forca);
        }
        else if (nivel == 2){
        int aumento = rand.nextInt(3);
            defesa += aumento;
            JOptionPane.showMessageDialog(null, "Sua defesa aumentou para "+ defesa);
        
        }
          else if (nivel == 3){
        int aumento = rand.nextInt(3);
            vida += aumento;
            antesVida = vida;
            JOptionPane.showMessageDialog(null, "Sua vida aumentou para "+ vida);
        
        }
    }

}
