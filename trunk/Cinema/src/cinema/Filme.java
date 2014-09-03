/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Filme {
    
    String nome;
    String genero;
    float dura;
    int clas;
    int idade,maioridade=0;
   
    void atribuirNome (String valor)
    {
        nome = valor;
    }
    
    String retornarNome()
    {
        return nome;
    }
    
   void atribuirDura (float valor)
   {
       
       dura = valor;
   }
   
   float retornarDura()
   {
       return dura;
   }
   
   void atribuirClass (int valor)
   {
       clas = valor;
   }
   
   int retornarClas ()
   {
       return clas;
   }
   
   void atribuirGenero (String valor)
    {
        genero = valor;
    }
    
    String retornarGenero()
    {
        return  genero;
    }
    
    void atribuirIdade (int valor){
       idade = valor;
       
        boolean maioridade = clas < idade;
        
       if (maioridade = false){
           JOptionPane.showMessageDialog(null,"Você não pode assistir este filme");
       }
       else{
           JOptionPane.showMessageDialog(null,"Você pode assistir este filme");
       }
             
    }
    
    int retornarIdade()
    {
        return idade;
    }
   
        
    
}
