

package Projeto_Surpresa;


public class Fantasia extends Roupas{
    
    
    private String nome;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   public String vFavorita () {
   
   
   return super.vFavorita() + " / " + nome;
   
   
   }
    
    
    
    
}
