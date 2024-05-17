package personagem;

import javax.swing.JLabel;
import java.util.ArrayList;


public class Inimigo extends JLabel{
    private int vida;
    private int forca;
    private int defesa;
    private int xp;
    private String emderecoImagemInimigoParado;
    private ArrayList <String> enderecosImagemAndandoEsquerda;
    private ArrayList <String> enderecosImagemAtacando;
    private int imagemAtualAtacando;
    private int imagemAtualAndandoEsquerda;
    private ArrayList <String> enderecosImagemAndandoDireita;
    private int imagemAtualAndandoDireita;
    private int danoInimigo;
    private boolean atacando;

    public Inimigo( ) {
 
    
        enderecosImagemAndandoEsquerda= new ArrayList();
        enderecosImagemAndandoDireita= new ArrayList();
        enderecosImagemAtacando= new ArrayList();
        
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getImagemAtualAndandoEsquerda() {
        return imagemAtualAndandoEsquerda;
    }

    public void setImagemAtualAndandoEsquerda(int imagemAtualAndandoEsquerda) {
        this.imagemAtualAndandoEsquerda = imagemAtualAndandoEsquerda;
    }

    public ArrayList<String> getEnderecosImagemAndandoDireita() {
        return enderecosImagemAndandoDireita;
    }

    public void setEnderecosImagemAndandoDireita(ArrayList<String> enderecosImagemAndandoDireita) {
        this.enderecosImagemAndandoDireita = enderecosImagemAndandoDireita;
    }
    
    


    public String getEmderecoImagemInimigoParado() {
        return emderecoImagemInimigoParado;
    }

    public void setEmderecoImagemInimigoParado(String emderecoImagemInimigoParado) {
        this.emderecoImagemInimigoParado = emderecoImagemInimigoParado;
    }

  

    public ArrayList<String> getEnderecosImagemAndandoEsquerda() {
        return enderecosImagemAndandoEsquerda;
    }

    public void setEnderecosImagemAndandoEsquerda(ArrayList<String> enderecosImagemAndandoHorisontalEsquerda) {
        this.enderecosImagemAndandoEsquerda = enderecosImagemAndandoEsquerda;
    }

    public int getImagemAtualAndandoHorisontalEsquerda() {
        return imagemAtualAndandoEsquerda;
    }

    public void setImagemAtualAndandoHorisontalEsquerda(int imagemAtualAndandoEsquerda) {
        this.imagemAtualAndandoEsquerda = imagemAtualAndandoEsquerda;
    }

    public ArrayList<String> getEnderecosImagemAndandoHorisontalDireita() {
        return enderecosImagemAndandoDireita;
    }

    public void setEnderecosImagemAndandoHorisontalDireita(ArrayList<String> enderecosImagemAndandoHorisontalDireita) {
        this.enderecosImagemAndandoDireita = enderecosImagemAndandoHorisontalDireita;
    }

    public int getImagemAtualAndandoDireita() {
        return imagemAtualAndandoDireita;
    }

    public void setImagemAtualAndandoDireita(int imagemAtualAndandoDireita) {
        this.imagemAtualAndandoDireita = imagemAtualAndandoDireita;
    }

    public int proximaImagemAndandoHorisontalEsquerda(){
        if (imagemAtualAndandoEsquerda==enderecosImagemAndandoEsquerda.size()-1){
            imagemAtualAndandoEsquerda=0;
        } else{
            imagemAtualAndandoEsquerda++;
        }
        return imagemAtualAndandoEsquerda;
    }
    
    public int proximaImagemAndandoHorisontalDirita(){
        if (imagemAtualAndandoDireita==enderecosImagemAndandoDireita.size()-1){
            imagemAtualAndandoDireita=0;
        } else{
            imagemAtualAndandoDireita++;
        }
        return imagemAtualAndandoDireita;
    }

    public int getDanoInimigo() {
        return danoInimigo;
    }

    public void setDanoInimigo(int danoInimigo) {
        this.danoInimigo = danoInimigo;
    }

    public ArrayList<String> getEnderecosImagemAtacando() {
        return enderecosImagemAtacando;
    }

    public void setEnderecosImagemAtacando(ArrayList<String> enderecosImagemAtacando) {
        this.enderecosImagemAtacando = enderecosImagemAtacando;
    }

    public int getImagemAtualAtacando() {
        return imagemAtualAtacando;
    }

    public void setImagemAtualAtacando(int imagemAtualAtacando) {
        this.imagemAtualAtacando = imagemAtualAtacando;
    }
    
    public int proximaImagemAtacando(){
        if (imagemAtualAtacando==enderecosImagemAtacando.size()-1){
            imagemAtualAtacando=0;
        } else{
            imagemAtualAtacando++;
        }
        return imagemAtualAtacando;
    }

    public boolean getAtacando() {
        return atacando;
    }

    public void setAtacando(boolean atacando) {
        this.atacando = atacando;
    }
    
    
    
}