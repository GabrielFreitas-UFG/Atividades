/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 *
 * @author Gabriel Freitas
 */
public class Horario {

    int h;
    int m;
    int s;
    
    // Sets --- intem 2    
    public void setH(int h) {
        this.h = h;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    // Gets --- intem 3    
    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }
    
    //Contrutores Item 4
    public String toString(){
        String str = "\n"+h+":"+m+":"+s+"\n";
        return str;
    }
    
    public Horario(int h, int m, int s){
        setH(h);
        setM(m);
        setS(s);
    }
    
    public Horario(int h){
        setH(h);
        setM(0);
        setS(0);
    }
    
    //Matodos Estaticos - Item 5
    public static boolean Hora(int hora){
        if(hora < 0 || hora > 24)
            return false;
        else
            return true;
    }
    public static boolean Min(int min){
        if(min < 0 || min > 60)
            return false;
        else
            return true;       
    }
    public static boolean Seg(int seg){
        if(seg < 0 || seg > 60)
            return false; 
        else
            return true;
    }
    
    public static int Diferenca (Horario h1, Horario h2){
        int t1, t2;
        
        t1 = (h1.getH()* 60) + h1.getM();
        t2 = (h2.getH()* 60) + h2.getM();
        if(t1>t2)
            return t1-t2;
        else
            return t2-t1;        
    }
}
