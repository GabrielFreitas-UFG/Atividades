/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filme;

/**
 *
 * @author Gabriel Freitas
 */
public class Filme {

    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal; 
    
    public Filme (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }   
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }    
    
    public String toString(){
        String str = "\n-----------------------------------\nCODIGO: "+codigo+"\nNOME: "+nome+"\nGENERO: "+genero+"\nANO: "+ano+"\nAUTOR PRINCIPAL: "+autorPrincipal+"\n-----------------------------------\n";
        return str;        
    }
    
    public static int qtd(int i){
        return i;
    }
    
}
