

package Projeto_Surpresa;


public class Astronauta extends Roupas{
    
    
    
    private String codsnasa = "uehuehe7853" ;
    private String dataroupa;

    public String getCodsnasa() {
        return codsnasa;
    }

    public void setCodsnasa(String codsnasa) {
        this.codsnasa = codsnasa;
    }

    public String getDataroupa() {
        return dataroupa;
    }

    public void setDataroupa(String dataroupa) {
        this.dataroupa = dataroupa;
    }
    
    public String vFavorita (){
    
    return super.vFavorita() + " - " + codsnasa;
    
    }
    
}
