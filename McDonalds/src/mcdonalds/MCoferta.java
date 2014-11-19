package mcdonalds;

public class MCoferta extends Produto {
    private Hamburguer hamburguer ;
    private String codigo;
    private String preço  ;
    private String nome ;
    private Batata_Frita batata ;
    private Bebida bebida;
    
    public double ValorDesconto (double desconto){
                
        desconto = hamburguer.getPreco()  + batata.getPreço() + bebida.getPreço() ;
        
        return desconto ;
    }
    
    public String Descrição_Oferta (String Descrição_Oferta) {
    
        return Descrição_Oferta;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public Batata_Frita getBatata() {
        return batata;
    }

    public void setBatata(Batata_Frita batata) {
        this.batata = batata;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }}
    
