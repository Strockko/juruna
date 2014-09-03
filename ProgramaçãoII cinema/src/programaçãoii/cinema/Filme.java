package programaçãoii.cinema;

import javax.swing.JOptionPane;

public class Filme {
String nome, genero,ator;
Float duracao;
Integer clasificacao, idade;
Boolean midade;

void atribuirnome (String valor){
    nome = valor;
}
 String retornarnome (){
     return nome;
 }
void atribuirdura (Float valor){
    duracao = valor;
}
Float retornadura (){
    return duracao;
}

void atribuircla (Integer valor){
    clasificacao = valor;
}
Integer retornacla (){
    return clasificacao;
}


void atribuirgenero (String valor){
    genero = valor;
}
 String retornargenero (){
     return genero;
 }
void atribuirator (String valor){
    ator = valor;
}
 String retornarator (){
   return ator;
}

void atribuiridade (Integer valor){
    idade = valor;

 midade = clasificacao < idade;
if(midade = false ){
    JOptionPane.showMessageDialog (null, "Você  pode assistir o filme");
}else {
    JOptionPane.showMessageDialog (null, "Você  não pode assistir o filme");
}
    
 
 
    
    
}
}