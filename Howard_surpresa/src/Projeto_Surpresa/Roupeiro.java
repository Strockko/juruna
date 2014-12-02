package Projeto_Surpresa;

import java.util.ArrayList;
import java.util.List;


public class Roupeiro {

    
    private String setoroupeiro;

    public String getSetoroupeiro() {
        return setoroupeiro;
    }

    public void setSetoroupeiro(String setoroupeiro) {
        this.setoroupeiro = setoroupeiro;
    }
    
    
    List <Roupas> lista = new ArrayList <Roupas>();
    
    public String mostraroupas (){
    
    String retorno;
    
    retorno = "Prateleira " + setoroupeiro + "\n";
    
        for (Roupas roupas : lista) {
            
            retorno = retorno + roupas.vFavorita() + "\n"; 
        }
    
    return retorno;
    
    }
    
    
    
    
}
