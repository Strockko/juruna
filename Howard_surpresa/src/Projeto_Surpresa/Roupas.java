package Projeto_Surpresa;

public class Roupas {
    
    
    private String descricao;
    private String cor;
    private Boolean favorita;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public Boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(Boolean favorita) {
        this.favorita = favorita;
    }
    
    
    public String vFavorita () {
     
        if (favorita == true) {
            return descricao + " - TÁ UM ARRASO!";
        }
        else { 
            return descricao + " - " + tipo + " - " + cor;
           
            }
        }

    }
