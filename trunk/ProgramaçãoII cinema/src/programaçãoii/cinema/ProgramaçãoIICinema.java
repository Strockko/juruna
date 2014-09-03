package programaçãoii.cinema;

import javax.swing.JOptionPane;


public class ProgramaçãoIICinema {
    public static void main(String[] args) {
       String nome,genero,ator;
       Integer clasificao,idade;
       Float duracao;
       Filme f = new Filme ();     
       
       //Entrada
       
       nome = JOptionPane.showInputDialog("Digite nome");
      f.atribuirnome(nome);
           
       genero = JOptionPane.showInputDialog("Digite o genero");
      f.atribuirgenero(genero);
           
       clasificao = Integer.parseInt(JOptionPane.showInputDialog("Digite a clasificação"));
      f.atribuircla(clasificao);
      
      duracao = Float.parseFloat(JOptionPane.showInputDialog("Digite a duração"));
      f.atribuirdura(duracao);
      
      ator = (JOptionPane.showInputDialog("Digite o melhor ator"));
      f.atribuirator(ator);
      
    // Saida  
      
      JOptionPane.showMessageDialog (null, "Nome do filme:\t"+ nome+"\n Genero:\t" + genero +"\n Classificacão:\t"+ clasificao +"\n Duração do filme:\t"+ duracao +"\nAtor do filme:\t"+ ator );
       
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
      f.atribuiridade(idade);
      
    
    }
}