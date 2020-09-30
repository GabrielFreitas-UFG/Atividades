/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filme;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gabriel Freitas
 */
public class Principal {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in); 
        
        int codigo;
        String nome;
        String genero;
        int ano;
        String autorPrincipal; 
        
        
        ArrayList<Filme> listaDeFilmes = new ArrayList();       
        do{
            System.out.println("Digite o codigo: ");
            codigo = input.nextInt(); 
            if(codigo == 0) break;
            
            System.out.println("Digite o nome: ");
            nome = input.nextLine();
            
            System.out.println("Digite o genero: ");
            genero = input.nextLine();
            
            System.out.println("Digite o ano: ");
            ano = input.nextInt();
            
            System.out.println("Digite o autor principal: ");
            autorPrincipal = input.nextLine();
            
            Filme f = new Filme(codigo, nome);
            f.setAno(ano);
            f.setAutorPrincipal(autorPrincipal);
            f.setGenero(genero);
            listaDeFilmes.add(f);
            
            System.out.println(f.toString());
            
            
        }while(codigo != 0);
        
            System.out.println("\n TOTAL DE FILMES: " + Filme.qtd(listaDeFilmes.size()));
               
    }
}
